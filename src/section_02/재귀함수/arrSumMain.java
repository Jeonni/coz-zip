package section_02.재귀함수;

import java.util.Arrays;


/*
    재귀
    - 원래의 자리로 되돌아가거나 되돌아온다.

    재귀 함수
    - 자기 자신을 호출하는 함수

    재귀함수의 장점
    - 불필요한 반복문을 사용하지 않으므로 코드 간결성, 수정에 용이
    - 변수를 여러 개 사용할 필요 없음

    재귀함수의 단점
    - 반복문과 다르게 코드의 흐름을 직관적으로 파악하기 힘듬
    - 메서드를 반복하여 호출하기 때문에 지역변수, 매개변수, 반환값을 모두 process stack 에 저장함
    - 그래서 더 많은 메모리를 사용하게 된다.
    - 메서드 호출하고 메서드가 종료된 이후 복귀를 위한 컨텍스트 스위칭 비용이 발생하게 된다.
 */
public class arrSumMain {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int output = arrSum(arr);
        System.out.println(output);
    }

    public static int arrSum(int[] arr){

        // 빈 배열을 받았을 때 0을 리턴하는 조건문
        // -> 가장 작은 문제를 해결하는 코드 & 재귀를 멈추는 코드
        if(arr.length == 0) return 0;

        int[] tail = Arrays.copyOfRange(arr, 1, arr.length);

        // 배열의 첫 요소 + 나머지 요소가 담긴 배열을 받는 arrSum 함수
        // -> 재귀(자기 자신을 호출)를 통해 문제를 작게 쪼개나가는 코드
        return arr[0] + arrSum(tail);
    }
}