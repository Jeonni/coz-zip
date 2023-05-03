package section_01.java_심화_Effective;

/*
    오버로딩
    - 깉은 클래스 내부에서 메서드 확장하기 위한 개념
    - 메소드 이름이 같고, 매개변수 개수나 타입이 달라야 함


    오버라이딩
    - 부모 클래스로부터 상속받은 메소드를 자식 클래스에서 재정의 하는 것
    - 메소드 이름, 매개변수, 리턴 값이 모두 같아야 함

    애너테이션
    - 컴파일러 또는 다른 프로그램에 필요한 정보 제공
 */

public class ExampleClass implements ExampleInterface{

    @Override // 상위 클래스의 메서드를 오버라이딩한 메서드임을 컴파일러에게 알려줌
    public void example() {}

    /*
        @Override
        - 메서드 앞에만 붙일 수 있는 애너테이션
        - 상위 클래스의 메서드를 오버라이딩 하거나 추상 메서드를 구현하는 메서드라는 것을 컴팡리러에게 알려줌
        - @Override를 사용하면 만약 상위 클래스(혹은 인터페이스)에서 같은 메서드명을 찾을 수 없을 시 컴파일 에러를 발생 시켜준다.
        - ==> 런타임 에러가 발생하는 것을 방지할 수 있다.
     */
}
