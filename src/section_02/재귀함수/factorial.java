package section_02.재귀함수;

public class factorial {
    public static void main(String[] args) {
        int output1 = forFactorial(3);
        System.out.println(output1); // 3*2*1 = 6

        int output2 = recursionFactorial(5);
        System.out.println(output2); // 5*4*3*2*1 = 120

    }

    // 반복문으로 구현한 팩토리얼 메서드
    public static int forFactorial(int number) {
        int result = 1;
        for (int count = number; count > 0; count--) {
            result *= count;
        }
        return result;
    }

    // 재귀 호출로 구현한 팩토리얼 메서드
    public static int recursionFactorial(int number) {
        if (number <= 1) return 1;
        return number * recursionFactorial(number - 1);
    }
}