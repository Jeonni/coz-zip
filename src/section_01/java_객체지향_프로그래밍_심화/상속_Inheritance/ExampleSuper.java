package section_01.java_객체지향_프로그래밍_심화.상속_Inheritance;

/*
    this 키워드
    - 자신의 객체 호출

    this() 키워드
    - 자신의 생성자 호출

    super 키워드
    - 상위 클래스의 객체 호출

    super() 키워드
    - 상위 클래스의 생성자 호출

    super, super() 키워드는 상위 클래스의 존재를 상정하며 상속관계를 전제로 한다.
 */
public class ExampleSuper {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.calNum();
    }
}

class SuperClass {
    int count = 20;
}

class SubClass extends SuperClass {
    int count = 16;

    void calNum() {
        System.out.println("count = " + count);
        System.out.println("this.count = " + this.count);
        System.out.println("super.count = " + super.count);
    }
}

/* Output
    count = 16
    this.count = 16
    super.count = 20
 */