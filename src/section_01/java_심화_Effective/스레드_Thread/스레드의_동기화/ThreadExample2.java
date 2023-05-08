package section_01.java_심화_Effective.스레드_Thread.스레드의_동기화;


/*
    임계 영역
    - 오로지 하나의 스레드만 코드를 실행할 수 있는 코드 영역

    락
    - 임계 영역을 포함하고 있는 객체에 접근할 수 있는 권한

    즉, 임계 영역으로 설정된 객체가 다른 스레드에 의해 작업이 이루어지고 있지 않을 때
    임의의 스레드 A는 해당 객체에 대한 락을 획득하여 임계 영역 내의 모드를 실행할 수 있다.


    스레드의_패키지의 ThraedExample 클래스의 오류를 해결하는 방법은 두 스레드가 동시에 실행되선 안되는 영역을 설정하는 것이다.
    즉, withdraw() 메서드를 두 스레드가 동시에 해결하지 못하게 해야 한다.

    -> withdraw() 메서드를 임게 영역으로 설정해야 한다.
    -> 특정 코드 구간을 임계 영역으로 설정할 때에는 'synchronized 키워드' 사용
 */
public class ThreadExample2 {
    public static void main(String[] args) {
        Runnable threadTask2 = new ThreadTask2();
        Thread thread1 = new Thread(threadTask2);
        Thread thread2 = new Thread(threadTask2);

        thread1.setName("김코딩");
        thread2.setName("박자바");

        thread1.start();
        thread2.start();
    }
}

class Account2 {
    // 잔액 나타내는 변수
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    // 인출 성공 시 true, 실패 시 false 반환
    // synchronized 키워드를 통해 임계 영역 설정
    public synchronized boolean withdraw(int money) {
        // 인출 가능 여부 판단
        if (balance >= money) {
            try {
                Thread.sleep(1000);
            } catch (Exception error) {
            }
            balance -= money;
            return true;
        }

        return false;
    }
}


class ThreadTask2 implements Runnable {
    Account2 account2 = new Account2();

    public void run() {
        while (account2.getBalance() > 0) {
            // 100-300원의 인출금을 랜덤으로 지정
            int money = (int) (Math.random() * 3 + 1) * 100;

            // withdraw를 실행시키는 동시에 인출 성공 여부를 변수에 할당
            boolean denied = !account2.withdraw(money);

            // 인출 결과 확인
            // 만약 withdraw가 false 리턴할 시, 즉 인출에 실패하면
            // 해당 내역에 DENIED를 출력
            System.out.println(String.format("Withdraw %d₩ By %s. Balance : %d %s",
                    money, Thread.currentThread().getName(), account2.getBalance(), denied ? "-> DENIED" : "")
            );
        }
    }
}


/*  Output
    Withdraw 300₩ By 김코딩. Balance : 700
    Withdraw 100₩ By 박자바. Balance : 600
    Withdraw 300₩ By 김코딩. Balance : 300
    Withdraw 200₩ By 김코딩. Balance : 0 -> DENIED
    Withdraw 300₩ By 박자바. Balance : 0

    - 인출금에 따라 잔액이 올바르게 출력된 것을 확인
 */