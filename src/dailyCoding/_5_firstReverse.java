package dailyCoding;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.StringWriter;

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
