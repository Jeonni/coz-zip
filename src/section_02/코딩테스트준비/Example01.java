package section_02.코딩테스트준비;

public class Example01 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(superIncreasing(arr));
    }

    // 배열의 각 요소들이 그 이전의 요소들의 합보다 큰지 여부를 확인하는 함수
    // 크면 true, 작으면 false
    public static boolean superIncreasing(int[] arr) {
        int sum = arr[0];  // 배열의 첫 번째 요소를 sum에 저장
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] <= sum){ // 배열의 각 요소가 그 이전의 요소들의 합보다 작거나 같을 경우
                return false; // false 반환
            }
            else{ // 배열의 각 요소가 그 이전의 요소들의 합보다 클 경우
                sum = sum + arr[i]; // sum에 배열의 각 요소를 더함
            }
        }
        return true;
    }
}