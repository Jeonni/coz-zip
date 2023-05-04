package section_01.java_심화_Effective.스트림_Stream.스트림의_중간연산;

import java.util.Arrays;

public class TerminalOperationExample {
    public static void main(String[] args) {

        // int 형 배열 생성
        int[] intArray = {1, 2, 3, 4, 5};

        System.out.println("-- intArray[] 배열 목록 --");
        Arrays.stream(intArray)
                .forEach(System.out::print);

        System.out.println("\n-------------------------");

        // 카운팅
        long count = Arrays.stream(intArray).count();
        System.out.println("intArray의 전체 요소 개수: " + count);

        // 합계
        long sum = Arrays.stream(intArray).sum();
        System.out.println("intArray의 전체 요소 합: " + sum);

        // 평균
        double average = Arrays.stream(intArray).average().getAsDouble();
        System.out.println("전체 요소의 평균값: " + average);

        // 최대값
        int max = Arrays.stream(intArray).max().getAsInt();
        System.out.println("최대값: " + max);

        // 최소값
        int min = Arrays.stream(intArray).min().getAsInt();
        System.out.println("최소값: " + min);

        // 배열의 첫 번째 요소
        int first = Arrays.stream(intArray).findFirst().getAsInt();
        System.out.println("배열의 첫 번째 요소: " + first);
    }
}

/* output
    intArray의 전체 요소 개수: 5
    intArray의 전체 요소 합: 15
    전체 요소의 평균값: 3.0
    최대값: 5
    최소값: 1
    배열의 첫 번째 요소: 1
 */