package section_01.java_객체지향_프로그래밍_심화.추상화_Abstraction;


/*
    인터페이스: 서로 다른 두 시스템, 장치, 소프트웨어 따위를 서로 이어주는 부분
    - 기본적으로 추상 메서드와 상수만들 멤버로 가질 수 있음
    - "추상 메서드의 집합" 이라고 기억하기.
    - 내부의 모든 필드가 public static final 로 정의
    - 내부의 모든 메서드가 public abstract 로 정의
    - 인터페이스를 구현하려면 implements 키워드를 사용
    - 사용자 입장: 역할과 구현을 분리시켜 코드 변경의 번거로움 최소화, 손쉽게 해당 기능 사용
    - 개발자 입장: 선언과 구현을 분리시켜 개발 시간을 단축, 독립적인 프로그래밍을 통해 한 클래스 변경이 다른 클래스에 미치는 영향 최소화
 */
interface Cover{ // 인터페이스 정의
    public abstract void call();
}

public class InterfaceExample02 {
    public static void main(String[] args) {
        User2 user = new User2();
        user.callProvider(new Provider2());
    }
}

class User2{
    // 매개변수의 다형성 활용하여 구체적 구현체가 아닌
    // 인터페이스를 매개변수로 받도록 정의
    public void callProvider(Cover cover){
        cover.call();
    }
}

class Provider2 implements Cover{
    public void call(){
        System.out.println("야호~");
    }
}