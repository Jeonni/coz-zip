package section_01.java_심화_Effective.람다_Lambda;

import java.util.function.BiFunction;
import java.util.function.Function;


/*
    생성자 참조
    - 메서드 참조는 생성자 참조도 포함
    - 생성자 참조한다는 것은 객체를 생성한다는 것을 의미

    생성자 참조 문법
    - 클래스 이름 :: new 연산자

    * 생성자가 오버로딩 되어 여러개가 있을 경우
    - 컴파일러는 함수형 인터페이스의 추상 메서드와 동일한 매개 변수 타입과 개수가 있는 생성자를 찾아 실행

 */

// Member.java - ConstructorRef.java
public class ConstructorRef {
    public static void main(String[] args) {
        Function<String, Member> function1 = Member::new;
        Member member1 = function1.apply("김코딩");

        BiFunction<String, String, Member> function2 = Member::new;
        Member member2 = function2.apply("김코딩", "KimCoding");
    }
}

/*
    위 코드는 생성자 참조를 이용하여 두 가지 방법으로 Member 객체를 생성하고있음
    하나는 Function<String, Member> 함수형 인터페이스의 Member apply(String) 메서드를 이용하여 Member 객체 생성
    하나는 Function<String, String, Member> 함수형 인터페이스의 Member 객체 생성
 */


/*  Output
    Member(String id) 실행
    Member(String name, String id) 실행
 */
