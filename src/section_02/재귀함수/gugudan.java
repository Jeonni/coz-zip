package section_02.재귀함수;

public class gugudan {
    public static void main(String[] args) {
        // 반복문으로 구현한 3단
        forGugudan(3);

        System.out.println("=========");

        // 재귀호출로 구현한 5단
        recursionGugudan(5, 1);
    }

    // 반복문으로 구현한 구구단
    public static void forGugudan(int level) {
        for (int count = 1; count < 10; count++) {
            System.out.printf("%d x %d = %d\n", level, count, level * count);
        }
    }

    // 재귀 호출로 구현한 구구단
    public static void recursionGugudan(int level, int count) {
        if (count > 9) return;
        System.out.printf("%d x %d = %d\n", level, count, level * count);
        recursionGugudan(level, ++count);
    }
}
