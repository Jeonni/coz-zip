package section_01.java_심화_Effective.스트림_Stream.스트림의_중간연산;

import java.util.Arrays;

public class flatMapOperationExample {

    public static void main(String[] args) {
        String[][] namesArray = new String[][]{{"박해커", "이자바"}, {"김코딩", "나박사"}};

        // map 사용
        Arrays.stream(namesArray)
                .map(inner -> Arrays.stream(inner))
                .forEach(System.out::println);

        // flatMap()
        // 요소들을 평평하게 한다. "플래트닝"
        Arrays.stream(namesArray).flatMap(Arrays::stream).forEach(System.out::println);
    }
}

/* Output
    박해커
    이자바
    김코딩
    나박사
 */
