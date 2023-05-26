package dailyCoding;

public class _13_readVertically {
    public static void main(String[] args) {

//        String[] input = new String[]{
//                "hello",
//                "wolrd",
//        };
//        String output = readVertically(input);
//        System.out.println(output); // --> "hweolllrod"

        String[] input = new String[]{
                "hi",
                "wolrd",
        };
        String output = readVertically(input);
        System.out.println(output); // --> "hwiolrd"
    }

    public static String readVertically(String[] arr) {
        // TODO: 문자열을 요소로 갖는 배열을 입력받아 문자열을 세로로 읽었을 때의 문자열을 리턴해야 합니다.
        if (arr == null || arr.length == 0) return "";

        int maxLength = 0;
        for (String str : arr) {
            maxLength = Math.max(maxLength, str.length());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < maxLength; i++) {
            for (String str : arr) {
                if (i < str.length()) {
                    sb.append(str.charAt(i));
                }
            }
        }

        return sb.toString();
    }
}
