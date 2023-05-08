package section_01.java_심화_Effective.스레드_Thread.스레드의_생성과_실행;

public class ThreadExample3 {
    public static void main(String[] args) {

        // 익명 Runnable 구현 객체를 활용하여 스레드 생성
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.print("#");
                }
            }
        });

        // 실행
        thread1.start();

        for (int i = 0; i < 100; i++) {
            System.out.print("@");
        }
    }
}
