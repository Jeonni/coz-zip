
package section_02.코딩테스트준비;

public class Example02 {
    public static void main(String[] args) {
        String str = "432142141324";
        String output = inserDash(str);
        System.out.println(output); // 432142141-324
    }

    public static String inserDash(String str) {
        char[] list = str.toCharArray();
        String result = "";

        for (int i = 1; i < list.length; i++) {
            int preChar = Character.getNumericValue(list[i - 1]); // 앞의 문자
            int curChar = Character.getNumericValue(list[i]); // 뒤의 문자

            if (preChar % 2 == 1 && curChar % 2 == 1) { // 둘 다 모두 홀수일 경우에
                result += preChar + "-"; // 앞의 문자 뒤에 - 붙이기
            } else { // 둘 다 모두 홀수가 아닌 경우에
                result += preChar; // 그냥 붙이기
            }
            if (i == list.length - 1) result = result + curChar; // 마지막 인덱스에 다다르면 결과 같에 curChar 붙이기
        }

        return result;
    }
}
