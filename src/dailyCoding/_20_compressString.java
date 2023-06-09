package dailyCoding;

public class _20_compressString {
    public static void main(String[] args) {
        String output = compressString("abc");
        System.out.println(output); // --> "abc"

        String output2 = compressString("wwwggoppopppp");
        System.out.println(output2); // --> "3wggoppo4p"
    }

    public static String compressString(String str) {
        // TODO: 문자열을 입력받아 연속되는 문자가 있을 경우, 연속 구간을 반복되는 수와 문자로 조합한 형태로 압축한 문자열을 리턴해야 합니다.
        // 빈 문자열을 입력받은 경우, 빈 문자열을 리턴해야 합니다.
        // 3개 이상 연속되는 문자만 압축합니다.
        if (str.length() == 0) return "";

        int count = 1;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i++) {
            char curWord = str.charAt(i);
            char nextWord = str.charAt(i + 1);
            // 같은지 검사하고 카운팅하기
            if (curWord == nextWord) {
                count++;
            } else {
                isCompareCounting(count, sb, curWord);
                count = 1;
            }
        }

        char lastWord = str.charAt(str.length() - 1);
        isCompareCounting(count, sb, lastWord);

        return sb.toString();
    }

    private static void isCompareCounting(int count, StringBuilder sb, char curWord) {
        if (3 <= count) {
            sb.append(count).append(curWord);
        } else {
            for (int j = 0; j < count; j++) {
                sb.append(curWord);
            }
        }
    }
}
