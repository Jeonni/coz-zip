package section_01.java_객체지향_프로그래밍_심화.상속_Inheritance;

/*
    상속: 기존의 클래스를 재활용하여 새로운 클래스를 작성하는 자바 문법요소
    - 예를 들면 상위 클래스/하위 클래스로 나누어 상위 클래스의 멤버를 하위 클래스와 공유하는 것
    - 위에서 두 클래스는 서로 상속 관계에 있다고 하며 > 하위 클래스는 상위 클래스의 모든 멤버를 상속받게 된다.
    - 하위 클래스 멤버 개수 >= 상위 클래스 멤버 개수
    - "~ 클래스로부터 확장되었다." 라고 표현하기
    - extends 키워드 사용
    - 중복을 제거: 코드 재사용으로 보다 적은 양의 코드로 새로운 클래스를 작성할 수 있음
    - 다형적 표현 가능
    - 다형성: 하나의 객체가 여러 모양으로 표현될 수 있다는 것
    - 자바의 OOP 프로그래밍은 단일 상속만을 허용함
 */

class Person{

    String name;
    int age;

    void learn(){
        System.out.println("공부한다.");
    }

    void walk(){
        System.out.println("걷는다.");
    }

    void eat(){
        System.out.println("밥을 먹는다.");
    }
}

// Person 클래스로부터 상속
// extends 키워드 사용
class Programmer extends Person{
    String companyName;

    void coding(){
        System.out.println("코딩한다.");
    }
}

// Person 클래스로부터 상속
class Dancer extends Person{
    String groupName;

    void dancing(){
        System.out.println("춤을 춘다.");
    }
}

// Person 클래스로부터 상속
class Singer extends Person{
    String bandName;

    void singing(){
        System.out.println("노래한다.");
    }

    void playGuiter(){
        System.out.println("기타친다.");
    }
}


public class HelloJava {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "김코딩";
        person.age = 20;
        person.learn();
        person.eat();
        person.walk();
        System.out.println(person.name);

        // Programmer 객체 생성
        Programmer pg = new Programmer();
        pg.name = "이해커";
        pg.age = 30;
        System.out.println(pg.name);
        pg.coding();

        // Dancer 객체 생성
        Dancer dancer = new Dancer();
        dancer.name = "박댄서";
        dancer.age = 18;
        System.out.println(dancer.name);
        dancer.dancing();

        // Singer 객체 생성
        Singer singer = new Singer();
        singer.name = "정가수";
        System.out.println(singer.name);
        singer.age = 24;
        singer.singing();
    }
}

/* Output
    공부한다.
    밥을 먹는다.
    걷는다.
    김코딩
    이해커
    코딩한다.
    박댄서
    춤을 춘다.
    정가수
    노래한다.
 */
