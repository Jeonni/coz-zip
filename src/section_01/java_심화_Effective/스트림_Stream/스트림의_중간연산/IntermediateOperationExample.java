package section_01.java_심화_Effective.스트림_Stream.스트림의_중간연산;

import java.util.Arrays;
import java.util.List;

/*
    매핑 (map())
    - 스트림 내 요소들에서 원하는 필드만 추출하거나 특정 형태로 변환할 때 사용하는 중간 연산자
    - filter() 메서드와 마찬가지로 값을 변환하기 위한 조건을 람다식으로 정의
 */
public class IntermediateOperationExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("kimcoding", "javalee", "hackerna", "luckyguy");
        List<Integer> list = Arrays.asList(1, 3, 6, 9);


        // 기존의 names 문자열을 반환
        names.stream()
                .forEach(element -> System.out.println(element));

        System.out.println("----- toUpperCase() -----");

        // 소문자를 대문자로 바꾼 문자를 반환
        names.stream()
                .map(element -> element.toUpperCase())
                .forEach(element -> System.out.println(element));

        System.out.println("---- ---- ---- ----");

        list.stream().forEach(number -> System.out.println(number));
        System.out.println("---- Multiple ----");

        // 각 요소에 3을 곱한 값을 반환
        list.stream()
                .map(number -> number * 3)
                .forEach(number -> System.out.println(number));

    }
}
