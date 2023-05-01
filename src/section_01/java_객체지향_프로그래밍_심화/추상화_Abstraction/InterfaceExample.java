package section_01.java_객체지향_프로그래밍_심화.추상화_Abstraction;

public class InterfaceExample {
    public static void main(String[] args) {
        User user = new User(); // User 클래스 객체 생성
        user.callProvider(new Provider()); // Provider 객체 생성 후에 매개변수로 전달
    }
}

class User{ // User 클래스
    public void callProvider(Provider provider){
        provider.call();
    }
}

class Provider{ // Provider 클래스
    public void call(){
        System.out.println("무야호");
    }
}

/* Output
    무야호
 */
