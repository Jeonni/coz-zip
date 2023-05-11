package dailyCoding;

/*
연이율을 입력받아 원금이 2배 이상이 될 때까지 걸리는 시간(년)을 리턴해야 합니다.
 */
public class _2_computeWhenDouble {

    public static void main(String[] args) {
        int output = computeWhenDouble(7);
        System.out.println(output); // --> 11
    }

    public static int computeWhenDouble(double interestRate) {
        // TODO:
        // 원금
        double principal = 1;
        // 연이율
        double rate = 1 + interestRate / 100;
        // 카운팅 할 변수
        int years = 0;
        // 원금이 2배 미만일 때까지 카운팅
        while (principal < 2) {
            principal *= rate;
            years++;
        }
        return years;
    }
}
