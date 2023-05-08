package section_01.java_심화_Effective.스레드_Thread.스레드의_생성과_실행;

public class ThreadExample4 {
    public static void main(String[] args) {

        // Thread 하위 객체를 활용한 스레드 생성 및 실행
        Thread thread2 = new Thread(){
            public void run(){
                for(int i=0; i<100; i++){
                    System.out.print("#");
                }
            }
        };

        thread2.start();

        for(int i=0; i<100; i++){
            System.out.print("@");
        }
    }
}
