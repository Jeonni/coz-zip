package dailyCoding;

public class _25_power {
    public static void main(String[] args) {
        long output = power(3, 40);
        System.out.println(output); // --> 19334827
    }

    public static long power(int base, int exponent) {
        // TODO: 두 수를 입력받아 거듭제곱을 리턴해야 합니다.
        long output = 1;
        for (int i = 0; i < exponent; i++) {
            output *= base;
            output %= 94906249;
        }
        return output;
    }
}
