package section_01.java_객체지향_프로그래밍_심화.추상화_Abstraction;


/*
    추상 클래스
    - 메서드 시그니처만 존재하고 바디가 선언되어 있지 않은 추상 메서드를 포함하는 '미완성 설계도'
    - 미완성 구조이므로 객체를 생성하는 것이 불가능

    추상 클래스 사용하는 이유
    - 상속 관계에 있어 새로운 클래스 작성에 유용
    - 상위 클래스: 선언부만 작성, 하위 클래스: 구체적인 내용 작성 >> 설계 변화에 유용
    - 추상 클래스에는 결국 "객체의 공통적인 속성과 기능을 추출하여 정의하는 것”이라 할 수 있음

 */
abstract class Animal{ // 추상 메서드 선언되었으므로 해당 클래스도 abstract 키워드 적용해줘야 함
    public String kind;
    public abstract void sound(); // 추상 메서드
}

class Dog extends Animal{ // 오버라이딩
    public Dog(){
        this.kind = "표유류";
    }

    public void sound(){
        System.out.println("멍멍");
    }
}

class Cat extends Animal{ // 오버라이딩
    public Cat(){
        this.kind = "표유류";
    }

    public void sound() {
        System.out.println("야옹");
    }
}

public class DogExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();
    }
}