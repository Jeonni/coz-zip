package section_03.aop;

public class GugudanByForLoop implements Gugudan {
    // for문을 사용한 구구단 메서드
    @Override
    public void calculate(int level, int number) {

        // 시작 시간
//        long start = System.nanoTime();

        for (int count = number; count < 10; count++) {
            System.out.printf("%d * %d = %d\n", level, number, level * count);
        }

        // 종료 시간
//        long end = System.nanoTime();
//        System.out.println("--------------------------");
//        System.out.printf("[for문 구구단] %d단 실행 시간: %d\n", level, end - start);
    }
}
