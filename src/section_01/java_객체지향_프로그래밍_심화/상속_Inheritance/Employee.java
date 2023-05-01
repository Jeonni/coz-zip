package section_01.java_객체지향_프로그래밍_심화.상속_Inheritance;

/*
    포함 관계
    - 포함: 클래스를 재사용할 수 있는 방법
    - 클래스의 멤버로 다른 클래스 타입의 참조변수를 선언하는 것
    - Address 클래스로 해당 변수들을 묶어 준 다음, Employee 클래스 안에 참조변수를 선언
    - 코드의 중복을 없애고 포함관계로 재사용하고 있음

    - 클래스 간의 관계를 "~은 ~이다.(is-a)' 관계인지
    - 아니면 "~은 ~을 가지고 있다. (has-a)'관계인지 문장을 만들어 생각해보자
    - Employee는 Address이다.라는 문장은 성립하지 않는 반면,
    - Employee는 Address를 가지고 있다.는 어색하지 않은 올바른 문장임을 알 수 있습니다.
    - 따라서 이 경우에는 상속보다는 포함관계가 적합합니다.
 */
public class Employee{
    int id;
    String name;
    Address address;

    public Employee(int id, String name, Address address){
        this.id= id;
        this.name = name;
        this.address = address;
    }

    void showInfo(){
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.country);
    }

    public static void main(String[] args) {
        Address address1 = new Address("도쿄", "일본");
        Address address2 = new Address("광주", "한국");

        Employee employee1 = new Employee(1, "김코딩", address1);
        Employee employee2 = new Employee(2, "박해커", address2);

        employee1.showInfo();
        employee2.showInfo();
    }
}

class Address{
    String city, country;

    public Address(String city, String country){
        this.city = city;
        this.country = country;
    }
}


/* Output
    1 김코딩
    도쿄 일본
    2 박해커
    광주 한국
 */