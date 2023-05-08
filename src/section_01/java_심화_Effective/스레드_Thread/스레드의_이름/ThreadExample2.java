package section_01.java_심화_Effective.스레드_Thread.스레드의_이름;

// 스레드 이름 설정하기
public class ThreadExample2 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Set and Get Thread Name");
            }
        });

        thread.start();

        System.out.println("thread.getName(): " + thread.getName());

        thread.setName("Jeonni");

        System.out.println("thread.getName(): " + thread.getName());

    }
}


/* output
    thread.getName(): Thread-0
    thead.getName(): Jeonni
 */