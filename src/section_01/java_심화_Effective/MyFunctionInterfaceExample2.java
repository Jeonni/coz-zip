package section_01.java_심화_Effective;

// 매개변수가 있는 람다식 (리턴값은 없음)
public class MyFunctionInterfaceExample2 {
    public static void main(String[] args) {
        MyFunctionInterface2 example2;

        // output : 10
        example2 = (x) -> {
            int result = x * 5;
            System.out.println(result);
        };
        example2.accept(2);


        // output : 25
        example2 = (x) -> System.out.println(x * 5);
        example2.accept(5);
    }
}
