package dailyCoding;

public class _14_superIncreasing {
    public static void main(String[] args) {
        boolean output3 = superIncreasing(new int[]{979, 1737, -2146, -337, 1316});
        System.out.println(output3); // --> false
    }

    public static boolean superIncreasing(int[] arr) {
        // TODO: 수를 요소로 갖는 배열을 입력받아 각 요소들이 그 이전의 요소들의 합보다 큰지 여부를 리턴해야 합니다.
        int sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (sum >= arr[i]) return false;
            sum += arr[i];
        }

        return true;
    }
}
