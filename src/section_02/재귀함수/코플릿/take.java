package section_02.재귀함수.코플릿;

import java.util.Arrays;

// 수(num)와 배열을 입력받아 차례대로 num개의 요소만 포함된 새로운 배열을 리턴해야 합니다.
public class take {
    public static void main(String[] args) {
        int[] output = take(2, new int[]{1, -2, 1, 3});
        System.out.println(output);
    }

    public static int[] take(int num, int[] arr) {
        // TODO:
        if (arr.length <= num) return arr;
        if (num == 0 || arr.length == 0) return new int[]{};
        int[] newTake = Arrays.copyOfRange(arr, 0, arr.length - 1);
        return take(num, newTake);
    }
}