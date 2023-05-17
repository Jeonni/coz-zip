package dailyCoding;

/*
문자열을 입력받아 문자열을 구성하는 각 단어의 첫 글자가 대문자인 문자열을 리턴해야 합니다.
 */
public class _6_letterCapitalize {
    public static void main(String[] args) {
        String output1 = letterCapitalize("hello world");
        System.out.println(output1); // "Hello World"
        String output2 = letterCapitalize("java  is good");
        System.out.println(output2); // "Java  Is Good"
        String output3 = letterCapitalize("       ");
        System.out.println(output3); // ""

    }

    public static String letterCapitalize(String str) {
        // TODO:
        StringBuilder sb = new StringBuilder();
        boolean flag = true;

        for (char c : str.toCharArray()) {
            if (Character.isWhitespace(c)) {
                flag = true;
            } else {
                if (flag) {
                    c = Character.toUpperCase(c);
                    flag = false;
                }
            }
            sb.append(c);
        }
        return sb.toString().trim();
    }
}