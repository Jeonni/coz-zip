package section_01.java_심화_Effective.스레드_Thread.스레드의_생성과_실행;

/*
    프로세스와 스레드

    프로세스
    - 실행 중인 애플리케이션

    스레드
    - 하나의 코드 실행 흐름

    멀티 스레드
    - 멀티 스레드 프로세스: 하나의 프로세스가 여러 개의 스레드를 가질 수 있다.
    - 멀티 스레딩: 여러 스레드가 동시에 작업을 수행한다.
 */


// 01. Runnable 인터페이스를 구현한 객체에서 run()을 구현하여 스레드를 생성하고 실행하는 방법
public class ThreadExample1 {
    public static void main(String[] args) {
        // Runnable 인터페이스를 구현한 객체 생성
        Runnable task1 = new ThreadTask1();

        // Runnable 구현 객체를 인자로 전달하면서 Thread 클래스를 인스턴스화 하여 스레드를 생성
        Thread thread1 = new Thread(task1);

        // 작업 스레드를 실행시켜, run() 내부의 코드를 처리하도록 한다.
        thread1.start();

        // 반복문 추가
        // main 메서드의 반복문에서 출력한 문자
        for (int i = 0; i < 100; i++) {
            System.out.print("@");
        }


        // 위의 두 줄을 아래와 같이 축약할 수 있다.
        // Thread thread1 = new Thread(new ThreadTask1());
    }
}

class ThreadTask1 implements Runnable {

    // run() 메서드의 반복문에서 출력한 문자
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("#");
        }
    }
}

/*  output
    @####@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#######################################################@@@####################@@#####################

    @는 main 메서드의 반복문에서 출력한 문자
    - 메인 스레드의 반복문 코드 실행에 의해 출력되었다.

    #은 run()의 메서드 반복문에서 출력한 문자
    - 작업 스레드의 반복문 코드 실행에 의해 출력되었다.

    @과 #이 섞여있는 이유
    - 메인 스레드와 작업 스레드가 동시에 병렬로 실행되면서
      각각 main 메서드와 run() 메서드의 코드를 실행시켰기 때문에 두 가지 문자가 섞여서 출력된 것임

 */
