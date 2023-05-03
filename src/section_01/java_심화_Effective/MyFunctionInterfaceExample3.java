package section_01.java_심화_Effective;

public class MyFunctionInterfaceExample3 {
    public static void main(String[] args) throws Exception {
        MyFunctionInterface3 example3;


        // case01 : 출력값 7
        example3 = (x, y) -> {
            int result = x + y;
            return result;
        };
        int result1 = example3.accept(2, 5);
        System.out.println(result1);


        // case02 : 출력값 10
        example3 = (x, y) -> {
            return x + y;
        };
        int result2 = example3.accept(5, 5);
        System.out.println(result2);


        // case03 : 출력값 15
        // return 문만 있으면 중괄호와 return 문 생략 가능
        example3 = (x, y) -> x + y;
        int result3 = example3.accept(5, 10);
        System.out.println(result3);


        // case04 : 출력값 20
        // return 문만 있으면 중괄호와 return 문 생략 가능
        example3 = (x, y) -> sum(x, y);
        int result4 = example3.accept(5, 15);
        System.out.println(result4);
    }

    public static int sum(int x, int y) {
        return x + y;
    }
}

/*
    자바에서 기본적으로 제공하는 "함수형 인터페이스"
    - 자바에서는 빈벅하게 사용되는 함수형 인터페이스를 제공하고 있다.
      즉, 기본적으로 내장된 함수형 인터페이스를 사용하여
      매번 같은 기능을 수행하는 함수형 인터페이스를 직접 만드는 번거로움을 줄여주는 것이다.
 */