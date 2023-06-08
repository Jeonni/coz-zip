package section_03.aop;

public class GugudanByRecursion implements Gugudan {
    // 재귀 호출로 구현한 구구단
    @Override
    public void calculate(int level, int count) {

        // 시작 시간
//        long start = System.nanoTime();

        if (count > 9) return;
        System.out.printf("%d * %d = %d\n", level, count, level * count);
        calculate(level, ++count);

        // 종료 시간
//        long end = System.nanoTime();
//        System.out.println("-----------------------------");
//        System.out.printf("[재귀 구구단] %d단 실행 시간: %d\n", level, end - start);
    }
}
