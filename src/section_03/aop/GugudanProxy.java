package section_03.aop;

public class GugudanProxy implements Gugudan {
    private Gugudan delegator;

    public GugudanProxy(Gugudan delegator) {
        this.delegator = delegator;
    }

    @Override
    public void calculate(int level, int count) {
        long start = System.nanoTime();
        delegator.calculate(2, 1);
        long end = System.nanoTime();

        System.out.printf("클래스명: %s\n", delegator.getClass());
        System.out.printf("실행 시간: %d ms\n", end - start);
        System.out.println("-------------------------------");
    }
}
