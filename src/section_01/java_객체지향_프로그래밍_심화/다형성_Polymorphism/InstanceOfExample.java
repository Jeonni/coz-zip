package section_01.java_객체지향_프로그래밍_심화.다형성_Polymorphism;

/*  instanceof 연산자: 참조 변수 타입의 변환
    즉, 캐스팅이 가능한지 여부를 boolean 타입으로 확인할 수 있는 자바 문법 요소
 */
public class InstanceOfExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal instanceof Object);
        System.out.println(animal instanceof Animal);
        // 다운 캐스팅 시에는 형 변환 연산자 명시해야 함
        System.out.println(animal instanceof Bat);

        Animal cat = new Cat();
        System.out.println(cat instanceof Object);
        System.out.println(cat instanceof Animal);
        System.out.println(cat instanceof Cat);
        // 상속 관계가 아니므로 타입 변환 불가능
        System.out.println(cat instanceof Bat);
    }
}

class Animal{};
class Bat extends Animal{};
class Cat extends  Animal{};



/* Output
true
true
false
true
true
true
false
 */