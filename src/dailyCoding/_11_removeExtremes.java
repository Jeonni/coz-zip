package dailyCoding;

// TODO: 문자열을 요소로 갖는 배열을 입력받아 가장 짧은 문자열과 가장 긴 문자열을 제거한 배열을 리턴해야 합니다.
public class _11_removeExtremes {
    public static void main(String[] args) {
        String[] output = removeExtremes(new String[]{"a", "b", "c", "def"});
        System.out.println(output); // --> ["a"', "b"]

        output = removeExtremes(new String[]{"where", "is", "the", "longest", "word"});
        System.out.println(output); // --> ["where", "the", "word"]
    }


    public static String[] removeExtremes(String[] arr) {
        if (arr.length == 0) return null;

        int maxLength = 0;
        int minLength = 20;
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() >= maxLength) {
                maxLength = arr[i].length();
                maxIndex = i;
            }
            if (arr[i].length() <= minLength) {
                minLength = arr[i].length();
                minIndex = i;
            }
        }

        String[] result = new String[arr.length - 2];
        int resultIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != maxIndex && i != minIndex) {
                result[resultIndex] = arr[i];
                resultIndex++;
            }
        }

        return result;
    }
}