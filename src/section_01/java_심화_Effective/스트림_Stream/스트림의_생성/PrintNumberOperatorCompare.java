package section_01.java_심화_Effective.스트림_Stream.스트림의_생성;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/*
    Stream (자바 8부터 도입)
    - 배열 및 컬렉션의 저장 요소를 하나씩 참조하여 람다식으로 처리할 수 있도록 하는 반복자

    Stream 을 사용하는 이유
    - for문, Iterator 사용 시 코드가 길고 복잡해질 수 있다.
 */
public class PrintNumberOperatorCompare {
    public static void main(String[] args) {

        // 01. Iterator 을 통한 반복 처리
        // 각 숫자를 배열화
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);

        // Iterator 생성
        Iterator<Integer> it = list1.iterator();

        // 리스트 순회하며 출력
        while (it.hasNext()) {
            int num = it.next();
            System.out.print(num); // output: 12345
        }

        // 02. Stream 을 통한 반복 처리
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = list2.stream();
        stream.forEach(System.out::print); // output: 12345

    }
}


/*
    위의 차이를 보면 스트림을 사용한 코드가 훨씬 간결화되었음을 알 수 있다.
    추가적으로 스트림 사용 시 "선언형 프로그래밍" 방식으로 데이터를 처리할 수 있음
    - 인간친화적이고, 직관적인 코드 작성이 가능하다.

    지금까지는 코드 한줄 씩 동작 원리를 이해하고 순차적으로 규정하는 방식인
    "명령형 프로그래밍"을 사용하였다. 이는 "어떻게" 코드를 작성할지에 대한 내용에 초점을 두었다.

    "선언형 프로그래밍"은 "무엇" 에 집중하여 코드를 작성하는 코드 방법론이다.
    즉, 내부의 동작 원리를 모르더라도 어떤 코드가 어떤 역할을 하는지 직관적으로 이해할 수 있다.
 */