package dailyCoding;

public class _22_bubbleSort {
    public static void main(String[] args) {
        int[] output = bubbleSort(new int[]{2, 1, 3});
        Console.log(output); // --> [1, 2, 3]
    }

    public static int[] bubbleSort(int[] arr) {
        // TODO: 정수를 요소로 갖는 배열을 입력받아 오름차순으로 정렬하여 리턴해야 합니다.
        for (int i = 1; i < arr.length; i++) {
            boolean isSwap = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    isSwap = true;
                }
            }
            if(isSwap == false) break;
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

class Console {
    public static void log(Object obj) {
        System.out.println(obj);
    }
}
