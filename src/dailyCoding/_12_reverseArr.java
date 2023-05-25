package dailyCoding;

import java.util.Arrays;

public class _12_reverseArr {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        int[] output = reverseArr(arr);
        System.out.println(Arrays.toString(output)); // --> [3, 2, 1]
    }


    public static int[] reverseArr(int[] arr) {
        // 금지된 문자열은 주석까지 확인합니다.
        // TODO: 배열을 입력받아 순서가 뒤집힌 배열을 리턴해야 합니다.

        if (arr.length == 0) return new int[]{};
        int[] head = Arrays.copyOfRange(arr, arr.length - 1, arr.length);
        int[] tail = reverseArr(Arrays.copyOfRange(arr, 0, arr.length - 1));

        int[] dest = new int[head.length + tail.length];

        System.arraycopy(head, 0, dest, 0, head.length);
        System.arraycopy(tail, 0, dest, head.length, tail.length);

        return dest;
    }
}
