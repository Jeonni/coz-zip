package section_02.재귀함수.코플릿;

import java.util.Arrays;


/*
   배열을 입력받아 모든 요소의 논리곱을 리턴해야 한다.

   and 연산자
   - A&&B: A와 B가 모두 참일 경우에만 true 반환
 */
public class and {
    public static void main(String[] args) {
        boolean output = and(new boolean[]{true, false, true});
        System.out.println(output);
    }

    public static boolean and(boolean[] arr) {
        // TODO:
        // arr[t, f, t, f]
        if (arr.length == 0) return true;

        boolean[] newArr = Arrays.copyOf(arr, arr.length - 1); // [t, f, t]
        return arr[arr.length - 1] && and(newArr); // f && and([t, f, t])
    }
}