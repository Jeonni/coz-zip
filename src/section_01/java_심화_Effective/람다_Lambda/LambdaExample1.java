package section_01.java_심화_Effective.람다_Lambda;


/*
    람다식
    - 함수형 프로그래밍 기법을 지원하는 자바의 문법 요소
    - 메서드를 하나의 식으로 표현한 것
    - 코드를 간결화, 명확히 표현할 수 있다는 장점

    - OOP 특성을 가진 자바의 특성에 따라 일반적인 함수가 아닌 익명의 객체이기 때문에
      기존의 자바 문법을 해치지 않으면서 함수형 프로그래밍 기법을 사용할 수 있게 됨
      => 이에 따라 "함수형 인터페이스"가 만들어지게 됨
 */

// ExampleFunction - LambdaExample1
public class LambdaExample1 {
    public static void main(String[] args) {
        ExampleFunction exampleFunction = (num1, num2) -> num1 + num2;
        System.out.println(exampleFunction.sum(10, 15));
    }
}


/*  Output
    25
 */