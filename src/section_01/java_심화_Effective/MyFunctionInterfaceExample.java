package section_01.java_심화_Effective;

// 매개변수와 리턴값이 없는 람다식
public class MyFunctionInterfaceExample {
    public static void main(String[] args) {
        MyFunctionInterface example = () -> System.out.println("accept() 메서드 호출");
        example.accept();
    }
}

/*  Output
    accept() 메서드 호출
 */