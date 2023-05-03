package section_01.java_심화_Effective.스트림_Stream.스트림의_생성;


import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
    컬렉션 타입(List, Set, Map 등)의 경우,
    컬렉션의 최상위 클래스인 Collection에 정의된 stream() 메서드를 사용하여 스트림을 생성할 수 있다.

    따라서 Collection으로부터 확장된 하위클래스 List와 Set을 구현한 컬렉션 클래스들은 모두 stream() 메서드를 사용하여 스트림을 생성할 수 있다.


 */
public class CollectionStreamCreator {
    public static void main(String[] args) {
        // * List 타입의 스트림을 생성하는 과정
        // 1. Arrays 클래스에 static하게 선언된 asList() 메서드를 사용하여 요소들을 리스트 타입의 참조변수에 할당한 뒤에
        // 2. stream() 메서드를 사용하여 스트림을 생성
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Stream<Integer> stream = list.stream();
        stream.forEach(System.out::print);

        // * 임의의 수 스트림 생성
        // 난수 생성
        // 무한 스트림: 스트림의 크기가 정해지지 않은 것
        IntStream ints1 = new Random().ints();
        ints1.forEach(System.out::println);

        // * 스트림 생성 범위 제한
        // 1. 매개변수로 스트림의 사이즈 전달 -> 범위 제한
        IntStream ints2 = new Random().ints(5);
        // 2. limit() 메서드를 사용하여 스트림의 사이즈 전달 -> 범위 제한
        IntStream ints3 = new Random().ints().limit(5);

        // * 특정 범위의 정수 (1-10)
        IntStream intStream = IntStream.rangeClosed(1, 10);
        intStream.forEach(System.out::println);
    }
}
