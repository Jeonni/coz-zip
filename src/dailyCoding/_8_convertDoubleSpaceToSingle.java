package dailyCoding;

public class _8_convertDoubleSpaceToSingle {
    public static void main(String[] args) {
        String output = convertDoubleSpaceToSingle("string  with  double  spaces");
        System.out.println(output); // --> "string with double spaces"
    }

    public static String convertDoubleSpaceToSingle(String str) {
        // TODO: 문자열을 입력받아 해당 문자열에 등장하는 두 칸의 공백을 모두 한 칸의 공백으로 바꾼 문자열을 리턴해야 합니다.
//        \s{2,} 정규표현식은 두 개 이상의 연속된 공백을 의미
//        return str.replaceAll("\\s{2,}", " ");
        String words[] = str.split("  ");
        return String.join(" ", words);
    }
}
