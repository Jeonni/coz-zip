package section_01.java_심화_Effective.스트림_Stream.스트림의_중간연산;

import java.util.stream.IntStream;

public class IntermediateOperationExample3 {
    public static void main(String[] args) {

        // 1-10 범위의 정수로 구성된 스트림 생성
        IntStream intStream = IntStream.rangeClosed(1, 10);
        // skip()
        // - 스트림의 일부 요소들을 건너 뜀
        // - 앞의 5개의 숫자를 건너뛰고 숫자 6부터 출력
        intStream.skip(5).forEach(System.out::println);

        System.out.println();

        IntStream intStream1 = IntStream.rangeClosed(1, 10);
        // limit()
        // - 앞에서부터 5개의 숫자만 입력
        // - 앞에서부터 5개의 숫자만 출력
        intStream1.limit(5).forEach(System.out::println);

        System.out.println();

        // peek()
        // - 요소들을 순회하며 특정 작업을 수행
        // - 짝수만 필터링하여 합계 구하기
        IntStream intStream2 = IntStream.rangeClosed(1, 10);
        int sum = intStream2.filter(element -> element % 2 == 0)
                .peek(System.out::println)
                .sum();

        System.out.println("합계: " + sum);
    }
}

/* output
    1
    2
    3
    4
    5

    6
    7
    8
    9
    10
 */