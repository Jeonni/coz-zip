package dailyCoding;

public class _18_numberSearch {
    public static void main(String[] args) {
        int output = numberSearch("Hello6 ");
        System.out.println(output); // --> 1

        int output2 = numberSearch("Hello6 9World 2,"); // 17 / 11
        System.out.println(output2); // --> 2

        int output3 = numberSearch("Hello6 9World 2, Nic8e D7ay!");
        System.out.println(output3); // --> 2
    }

    public static int numberSearch(String str) {
        // TODO: 문자열을 입력받아 문자열에서 숫자를 모두 찾아 더한 뒤에 해당 값을 (숫자와 공백을 제외한 나머지) 문자열의 길이로 나눈 값을 정수로 반올림하여 리턴해야 합니다.
        double total = 0;
        double result;
        String match = "[0-9]";

        for (int i = 0; i < str.length(); i++) {
            char compare = str.charAt(i);
            if (Character.isDigit(compare)) total += Character.getNumericValue(compare);
        }

        str = str.replaceAll(match, "");
        str = str.replaceAll(" ", "");

        result = total / str.length();

        return Integer.parseInt(String.valueOf(Math.round(result)));
    }
}
