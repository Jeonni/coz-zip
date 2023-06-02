package dailyCoding;

public class _17_computeSquareRoot {
    public static void main(String[] args) {
        String output = computeSquareRoot(9);
        System.out.println(output); // --> "3.00"

        output = computeSquareRoot(6);
        System.out.println(output); // --> "2.45"
    }


    public static String computeSquareRoot(int num) {
        // TODO: 수를 입력받아 제곱근 값을 소수점 두 자리까지 리턴해야 합니다.
        final int percision = 10;
        double x = percision;

        for (int i = 0; i < percision; i++) {
            x = 0.5 * (num / x + x);
        }

        return String.format("%.2f", x);
    }

}