package dailyCoding;

/*
문자열을 입력받아 문자열을 구성하는 각 단어의 첫 글자로 이루어진 문자열을 리턴해야 합니다.
 */
public class _4_firstCharacter {
    public static void main(String[] args) {
        String output = firstCharacter("hello world");
        System.out.println(output); // --> "hw"

        output = firstCharacter(
                "The community at Code States might be the biggest asset"
        );
        System.out.println(output); // --> "TcaCSmbtba"
    }

    public static String firstCharacter(String str) {
        // TODO:
        StringBuilder sb = new StringBuilder();

        if (str.length() == 0) return "";

        String[] words = str.split(" ");
        char[] firstChars = new char[words.length];

        for (int i = 0; i < words.length; i++) {
            firstChars[i] = words[i].charAt(0);
        }

        for (char firstChar : firstChars) {
            sb.append(firstChar);
        }

        return sb.toString();
    }
}
