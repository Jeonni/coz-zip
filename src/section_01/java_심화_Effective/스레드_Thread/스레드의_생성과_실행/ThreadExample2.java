package section_01.java_심화_Effective.스레드_Thread.스레드의_생성과_실행;

// 02. Thread 클래스를 상속받은 하위 클래스에서 run() 구현하여 스레드를 생성하고 실행하는 방법
public class ThreadExample2 {
    public static void main(String[] args) {
        // Thread 클래스를 상속받은 클래스를 인스턴스화 하여 스레드를 생성
        ThreadTask2 thread2 = new ThreadTask2();

        // 작업 스레드를 실행시켜, run() 내부의 코드를 실행하도록 처리
        thread2.start();

        // 반복문 추가
        for (int i = 0; i < 100; i++) {
            System.out.print("@");
        }
    }
}


class ThreadTask2 extends Thread {
    // run() 메서드 바디에 스레드가 수행할 작업 생성
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("#");
        }
    }
}
