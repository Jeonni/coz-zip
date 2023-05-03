package section_01.java_심화_Effective.스트림_Stream.스트림의_생성;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperator {
    public static void main(String[] args) {

        //ArrayList
        List<String> fruitList = new ArrayList<>();
        fruitList.add("바나나 ");
        fruitList.add("사과 ");
        fruitList.add("오렌지 ");

        // 배열
        String[] fruitArray = {"바나나 ", "사과 ", "오렌지 "};

        // 각각 스트림 생성
        Stream<String> ListStream = fruitList.stream();
        Stream<String> ArrayStream = Arrays.stream(fruitArray);

        // forEach() 메서드를 통해 각 요소를 순회하며 출력
        // - 데이터 소스의 각 요소를 순회하면서 람다식 안에 정의딘 명령을 실행하는 데 사용하는 최종 연산자
        ListStream.forEach(System.out::print);
        ArrayStream.forEach(System.out::print);
    }
}


/* Output
    바나나 사과 오렌지 바나나 사과 오렌지
 */
