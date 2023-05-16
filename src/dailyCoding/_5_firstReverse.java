package dailyCoding;

/*
문자열을 입력받아 순서가 뒤집힌 문자열을 리턴해야 합니다.
 */
public class _5_firstReverse {
    public static void main(String[] args) {
        String output = firstReverse("codestates");
        System.out.println(output); // "setatsedoc"

        output = firstReverse("I love codestate");
        System.out.println(output); // "setatsedoc evol I"
    }
    public static String firstReverse(String str) {
        // TODO:
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb.reverse().toString();
    }
}
