package section_01.java_심화_Effective.스레드_Thread.스레드의_동기화;

/*
    - 멀티 스레드 프로세스의 경우, 두 스레드가 같은 데이터를 공유하게 되는 문제 발생
    - 이 클래스는 이에 대한 오류 예시를 표식하기 위한 코드이다.
 */
public class ThreadExample {
    public static void main(String[] args) {
        Runnable threadTask = new ThreadTask();
        Thread thread1 = new Thread(threadTask);
        Thread thread2 = new Thread(threadTask);

        thread1.setName("김코딩");
        thread2.setName("박자바");

        thread1.start();
        thread2.start();
    }
}

class Account {
    // 잔액 나타내는 변수
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    // 인출 성공 시 true, 실패 시 false 반환
    public boolean withdraw(int money) {
        // 인출 가능 여부 판단
        if (balance >= money) {

            // if 문의 실행문에 진입하자 마자 해당 스레드를 정지 시키고,
            // 다른 스레드에게 제어권을 강제로 넘긴다.
            // 일부러 문제를 발생시키기 위해 추가한 코드
            try {
                Thread.sleep(1000);
            } catch (Exception error) {
            }

            // 잔액에서 인출금을 깎아 새로운 잔액을 기록
            balance -= money;

            return true;
        }

        return false;
    }
}


class ThreadTask implements Runnable {
    Account account = new Account();

    public void run() {
        while (account.getBalance() > 0) {
            // 100-300원의 인출금을 랜덤으로 지정
            int money = (int) (Math.random() * 3 + 1) * 100;

            // withdraw를 실행시키는 동시에 인출 성공 여부를 변수에 할당
            boolean denied = !account.withdraw(money);

            // 인출 결과 확인
            // 만약 withdraw가 false 리턴할 시, 즉 인출에 실패하면
            // 해당 내역에 DENIED를 출력
            System.out.println(String.format("Withdraw %d₩ By %s. Balance : %d %s",
                    money, Thread.currentThread().getName(), account.getBalance(), denied ? "-> DENIED" : "")
            );
        }
    }
}

/* Output
    Withdraw 200₩ By 박자바. Balance : 800
    Withdraw 300₩ By 김코딩. Balance : 800
    Withdraw 200₩ By 박자바. Balance : 600
    Withdraw 300₩ By 김코딩. Balance : 300
    Withdraw 300₩ By 박자바. Balance : 0
    Withdraw 200₩ By 김코딩. Balance : -200


    - 출력 결과를 보면 인출금과 잔액이 제대로 표시되어 있지 않다.

    이는 두 스레드 간에 객체가 공유되어 발생하는 문제로, 오류가 발생한 이유를 추출하기 어렵다.
    결국 이러한 상황이 발생하지 않게 하기 위해 '스레드 동기화'를 적용하여 문제를 해결할 수 있다.
 */