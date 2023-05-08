package section_01.java_심화_Effective.스레드_Thread.스레드의_이름;


/*
    메인 스레드는 main 이라는 이름을 가진다.
    그 외에 추가적으로 생성한 스레드는 기본적으로 'thread-n' 이라는 이름을 가진다.
 */

// 스레드 이름 조회하기
public class ThreadExample1 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Get Thread Name");
            }
        });

        thread.start();

        System.out.println("thread.getName(): " + thread.getName());
    }
}

/* output
    thread.getName(): Thread-0
 */