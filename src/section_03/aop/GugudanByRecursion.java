package section_03.aop;

public class GugudanByRecursion implements Gugudan {
    // 재귀 호출로 구현한 구구단
    @Override
    public void calculate(int level, int count) {
        if (count > 9) return;
        System.out.printf("%d * %d = %d\n", level, count, level * count);
        calculate(level, ++count);
    }
}
