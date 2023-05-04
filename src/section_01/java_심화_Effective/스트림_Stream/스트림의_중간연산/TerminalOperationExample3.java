package section_01.java_심화_Effective.스트림_Stream.스트림의_중간연산;

import java.util.Arrays;

public class TerminalOperationExample3 {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};

        // sum()
        long sum = Arrays.stream(intArray).sum();
        System.out.println("intArray 전체 요소의 합: " + sum);

        // 초기값 없는 reduce()
        int sum1 = Arrays.stream(intArray)
                .map(element -> element * 2)
                .reduce((a, b) -> a + b)
                .getAsInt();
        System.out.println("초기이 없는 reduce(): " + sum1);


        // 초기값 있는 reduce()
        // reduce()
        // - 스트림의 요소를 줄여나가면서 연산을 수행하고 최종 결과를 반환
        int sum2 = Arrays.stream(intArray)
                .map(element -> element * 2)
                .reduce(5, (a, b) -> a + b);
        System.out.println("초기값이 있는 reduce(): " + sum2);

    }
}
