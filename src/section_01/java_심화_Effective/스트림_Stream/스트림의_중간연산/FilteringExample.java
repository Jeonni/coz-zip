package section_01.java_심화_Effective.스트림_Stream.스트림의_중간연산;

import java.util.Arrays;
import java.util.List;

/*
    필터링 (filter(), distinct())
    - 조건에 맞는 데이터들만을 정제하는 역할

    distinct()
    - Stream 요소들에 중복된 데이터가 존재하는 경우, 중복을 제거하기 위해 사용

    filter()
    - Stream 에서 조건에 맞는 데이터만을 정제하여 더 작은 컬렉션을 만든다.
    - filter() 메서드에는 매개값으로 조건을 주고, 조건이 참인 요소들만 필터링한다.
    - 조건은 람다식을 사용하여 정의할 수 있다.
 */

public class FilteringExample {
    public static void main(String[] args) {
        // 리스트 추가
        List<String> names = Arrays.asList("김코딩", "이자바", "박해커", "김코딩", "박해커");

        names.stream()
                .distinct() // 중복 제거
                .forEach(element -> System.out.println(element));
        System.out.println();

        names.stream()
                .filter(element -> element.startsWith("김")) // 김씨 성을 가진 요소만 필터링
                .forEach(element -> System.out.println(element));
        System.out.println();

        names.stream()
                .distinct() // 중복 제거
                .filter(element -> element.startsWith("김")) // 김씨 서을 가진 요소만 필터링
                .forEach(element -> System.out.println(element));
    }
}

/*  Output
    김코딩
    이자바
    박해커

    김코딩
    김코딩

    김코딩
 */