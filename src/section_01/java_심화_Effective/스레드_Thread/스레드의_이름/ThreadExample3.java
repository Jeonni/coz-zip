package section_01.java_심화_Effective.스레드_Thread.스레드의_이름;

// 스레드의 인스턴스 주소값 얻기
public class ThreadExample3 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // 실행 중인 스레드의 주소값을 사용하는 경우
                // Thread 클래스의 정적 메서드인 currentThread() 사용
                System.out.println(Thread.currentThread().getName());
            }
        });

        thread.start();

        System.out.println(Thread.currentThread().getName());
    }
}

/*  output
    main
    Thread-0
 */