package dailyCoding;

import java.util.Arrays;

public class _16_isIsogram {
    public static void main(String[] args) {
        boolean output = isIsogram("aba");
        System.out.println(output); // false

        boolean output2 = isIsogram("Dermatoglyphics");
        System.out.println(output2); // true

        boolean output3 = isIsogram("moOse");
        System.out.println(output3); // false
    }

    public static boolean isIsogram(String str) {
        // TODO: 문자열을 입력받아 아이소그램인지 여부를 리턴해야 합니다. 아이소그램(isogram)은 각 알파벳을 한번씩만 이용해서 만든 단어나 문구를 말합니다.
        if (str.length() == 0) return true;

        str = str.toLowerCase();
        char[] strArr = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (strArr[i] == strArr[j]) return false;
            }
        }

        return true;
    }
}
