package section_03.aop;

public class GugudanByForLoop implements Gugudan {
    // for문을 사용한 구구단 메서드
    @Override
    public void calculate(int level, int number) {
        for (int count = number; count < 10; count++) {
            System.out.printf("%d * %d = %d\n", level, number, level * count);
        }
    }
}
