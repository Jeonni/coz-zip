package section_01.java_심화_Effective.스트림_Stream.스트림의_중간연산;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class IntermediateOperationExample2 {
    public static void main(String[] args){

        // 동물들의 이름을 모아둔 리스트
        List<String> animals = Arrays.asList("Tiger", "Lion", "Monkey", "Duck", "Horse", "Cow");

        // 기본 정렬
        // 인자값 없는 sort()
        System.out.println("---- 기본 정렬 ----");
        animals.stream().sorted().forEach(System.out::println);


        //인자값에 Comparator 인터페이스 규정에 메서드 사용
        System.out.println("---- 역순 정렬 ----");
        animals.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }
}


/* output
    Cow
    Duck
    Horse
    Lion
    Monkey
    Tiger


 */