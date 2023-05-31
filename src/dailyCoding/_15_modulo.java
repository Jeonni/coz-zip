package dailyCoding;

public class _15_modulo {
    public static void main(String[] args) {
        Integer output = modulo(25, 4);
        System.out.println(output); // --> 1

        output = modulo(25, 0);
        System.out.println(output); // --> null
    }

    public static Integer modulo(int num1, int num2) {
        // TODO: 두 수(num1, num2)를 입력받아, num1를 num2로 나눈 나머지를 리턴해야 합니다.
        if (num2 == 0) return null;

        int reminder = num1;

        while (reminder >= num2) {
            reminder -= num2;
        }

        return reminder;
    }
}
