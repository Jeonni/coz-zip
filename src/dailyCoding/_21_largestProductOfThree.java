package dailyCoding;

import java.util.Arrays;

public class _21_largestProductOfThree {
    public static void main(String[] args) {
        int output = largestProductOfThree(new int[]{2, 1, 3, 7});
        System.out.println(output); // --> 42 (= 2 * 3 * 7)

        int output2 = largestProductOfThree(new int[]{-1, 2, -5, 7});
        System.out.println(output2); // --> 35 (= -1 * -5 * 7)
    }

    public static int largestProductOfThree(int[] arr) {
        // TODO: 정수를 요소로 갖는 배열을 입력받아 3개의 요소를 곱해 나올 수 있는 최대값을 리턴해야 합니다.
        Arrays.sort(arr); // 오름차순 정렬
        int n = arr.length;
        // 가장 큰 세 개의 수의 곱, 가장 작은 두 개의 수(음수)와 가장 큰 수의 곱 중 더 큰 수를 선택
        int maxProduct = Math.max(arr[n - 1] * arr[n - 2] * arr[n - 3], arr[0] * arr[1] * arr[n - 1]);
        return maxProduct;
    }
}
