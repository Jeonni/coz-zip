package section_01.java_심화_Effective.스트림_Stream.스트림의_생성;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamCreator {
    public static void main(String[] args) {
        // 문자열 배열 선언 및 할당
        String[] arr = new String[]{"김코딩", "이자바", "박해커"};

        // 문자열 스트림 생성
        // 01. Arrays.stream()
        Stream<String> stream1 = Arrays.stream(arr);
        // 02. Stream.of()
        Stream<String> stream2 = Stream.of(arr);

        // 출력
        // 01. Arrays.stream()
        stream1.forEach(System.out::println);
        // 02. Stream.of()
        stream2.forEach(System.out::println);
    }
}

/* output
    김코딩
    이자바
    박해커
    김코딩
    이자바
    박해커
 */


/*
    출력값을 보면 Arrays.stream()와 Stream.of() 메서드 모두 같은 값을 출력하고 있다.
    따라서, 배열로 스트림을 생성할 때는 둘 중 편한 메서드를 임의로 선택하여 사용할 수 있다.
 */
