package section_02.재귀함수.코플릿;
import java.util.Arrays;


/*
    배열을 입력받아 모든 요소의 논리합(or)을 리턴해야 합니다.

    or 연산자
    - A||B 두 조건 중 하나라도 참이 있을 경우 true 반환
 */
public class or {
    public static void main(String[] args) {
        boolean output = or(new boolean[]{true, true, false});
        System.out.println(output); // --> true
    }

    public static boolean or(boolean[] arr){
        if (arr.length == 0) return true;

        boolean[] newArr = Arrays.copyOf(arr, arr.length - 1); // [t, f, t]
        return arr[arr.length - 1] || or(newArr);
    }
}
