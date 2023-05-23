package dailyCoding;

/*
문자열을 입력받아 연속된 한자리 홀수 숫자 사이에 '-'를 추가한 문자열을 리턴해야 합니다.
 */
public class _10_insertDash {
    public static void main(String[] args) {
        String output = insertDash("454793");
        System.out.println(output); // --> 4547-9-3
    }

    public static String insertDash(String str) {
        // TODO:
        if (str.length() == 0) return null;
        int[] numbers = new int[str.length()];
        // 배열에 숫자 하나씩 담기
        for (int i = 0; i < str.length(); i++) {
            numbers[i] = Character.getNumericValue(str.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(numbers[i]);
            if (i < numbers.length - 1 && isOdd(numbers[i]) && isOdd(numbers[i + 1])) sb.append("-");
        }

        return sb.toString();
    }

    public static boolean isOdd(int num) {
        // 홀수면 true, 짝수면 false 반환
        if (num == 0) {
            return false;
        } else if (num % 2 == 0) {
            return false;
        }
        return true;
    }
}
