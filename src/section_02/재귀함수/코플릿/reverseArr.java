package section_02.재귀함수.코플릿;

import java.util.Arrays;

// 배열을 입력받아 순서가 뒤집힌 배열을 리턴해야 합니다.
public class reverseArr {
    public static void main(String[] args) {
        int[] output = reverseArr(new int[]{1, 2, 3});
        System.out.println(Arrays.toString(output));
    }

    public static int[] reverseArr(int[] arr) {
        // base Case: 문제를 더 이상 쪼갤 수 없는 경우
        if (arr.length == 0) return new int[]{};

        // recursive Case: 그렇지 않은 경우
        // 배열의 마지막 요소를 -> 첫 번째 인덱스로
        int[] head = Arrays.copyOfRange(arr, arr.length-1, arr.length);
        // 남은 요소를 가진 tail 배열 선언 -> 배열 요소가 모두 제거될 때까지 재귀함수 호출
        int[] tail = reverseArr(Arrays.copyOfRange(arr, 0, arr.length-1));

        // 두 배열을 합치기 위한 배열 선언
        int[] newArr = new int[head.length + tail.length];
        System.arraycopy(head, 0, newArr, 0, head.length);
        System.arraycopy(tail, 0, newArr, head.length, tail.length);

        return newArr;
    }
}
