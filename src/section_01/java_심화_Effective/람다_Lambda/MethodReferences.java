package section_01.java_심화_Effective.람다_Lambda;

import java.util.function.IntBinaryOperator;

/*
    메서드 참조
    - 불필요한 매개변수를 제거할 때 주로 사용
    - 람다식으로 간단해진 익명 객체를 더욱 간단히 사용하기 위함
 */

// Calculator.java - MethodReferences.java
public class MethodReferences {
    public static void main(String[] args) {
        IntBinaryOperator operator;

        // 정적 메서드
        // 클래스 이름 :: 메서드 이름
        // Output = 8
        operator = Calculator::staticMethod;
        System.out.println("정적 메서드 결과 : " + operator.applyAsInt(3, 5));

        // 인스턴스 메서드
        // 인스턴스 이름 : 메서드 이름
        // Output = 15
        Calculator calculator = new Calculator();
        operator = calculator::instanceMethod;
        System.out.println("인스턴스 메서드 결과: " + operator.applyAsInt(3, 5));

    }
}
