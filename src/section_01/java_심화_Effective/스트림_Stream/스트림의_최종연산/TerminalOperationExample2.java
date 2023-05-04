package section_01.java_심화_Effective.스트림_Stream.스트림의_최종연산;

import java.util.Arrays;

public class TerminalOperationExample2 {
    public static void main(String[] args) {
        // int형 배열 생성
        int[] intArray = {2, 4, 6};

        System.out.println("---- intArray[] ----");
        Arrays.stream(intArray)
                .forEach(System.out::println);

        System.out.println(" ---- ---- ----");
        // allMatch()
        // - 모든 요소가 조건을 만족하는지 여부를 판단
        boolean result = Arrays.stream(intArray).allMatch(element -> element % 2 == 0);
        System.out.println("요소 모두 2의 배수인가요? " + result);

        // anyMatch()
        // - 하나라도 조건을 만족하는 요소가 있는지 여부를 판단
        result = Arrays.stream(intArray).anyMatch(element -> element % 3 == 0);
        System.out.println("요소 중 하나라도 3의 배수가 있나요? " + result);

        // noneMatch()
        // - 모든 요소가 조건을 만족하지 않는지 여부를 판단
        result = Arrays.stream(intArray).noneMatch(element -> element % 3 == 0);
        System.out.println("요소 중 3의 배수가 하나도 없나요? " + result);

    }
}
