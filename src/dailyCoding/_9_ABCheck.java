package dailyCoding;

public class _9_ABCheck {
    public static void main(String[] args) {
        boolean output = ABCheck("aaaaaccccbbbbb");
        System.out.println(output); // --> true
    }

    public static boolean ABCheck(String str) {
        // TODO:
        if (str.length() == 0) return false;

        str = str.toLowerCase();


        for (int i = 4; i < str.length(); i++) {
            if ((str.charAt(i) == 'a' && str.charAt(i - 4) == 'b') || (str.charAt(i) == 'b' && str.charAt(i - 4) == 'a'))
                return true;
        }

        return false;
    }
}