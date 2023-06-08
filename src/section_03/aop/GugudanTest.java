package section_03.aop;

public class GugudanTest {
    public static void main(String[] args) {
        // for문 구구단
        GugudanByForLoop gugudanByForLoop = new GugudanByForLoop();
        System.out.println("🎁 [for문 구구단] 2단");

        // 프록시 구현 (1)
        GugudanProxy gugudanProxy = new GugudanProxy(gugudanByForLoop);
        gugudanProxy.calculate(2, 1);

//        long start = System.nanoTime();
//        gugudanByForLoop.calculate(2, 1);
//        long end = System.nanoTime();

//        System.out.printf("📣 [for문 구구단] 실행 시간: %d ns\n", end - start);

        System.out.println();
        System.out.println();

        // 재귀 구구단
        GugudanByRecursion gugudanByRecursion = new GugudanByRecursion();
        System.out.println("🎁 [재귀 구구단] 2단");

        // 프록시 구현 (2)
        GugudanProxy gugudanProxy1 = new GugudanProxy(gugudanByRecursion);
        gugudanProxy1.calculate(2, 1);

//        long start2 = System.nanoTime();
//        gugudanByRecursion.calculate(2, 1);
//        long end2 = System.nanoTime();

//        System.out.printf("📣 [재귀 구구단] 실행 시간: %d ns\n", end - start);
    }
}
