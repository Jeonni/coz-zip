package section_01.java_객체지향_프로그래밍_심화.상속_Inheritance;


/*
    super 키워드
    - 상위 클래스의 객체 호출

    super() 키워드
    - 상위 클래스의 생성자 호출
 */
public class ExampleSuper02 {
    public static void main(String[] args) {
        Student student = new Student();
    }
}


class Human{
    Human(){
        System.out.println("휴먼 클래스 생성자");
    }
}

/*
    super() 메서드 또한 생성자 안에섬나 사용 가능, 반드시 첫 줄에 오기
    - 모든 생성자의 첫 줄에는 반드시 this() 또는 super()가 선언되어야 한다.
 */
class Student extends Human{ // Human 클래스로부터 상속

    public Student() {
        super();
        System.out.println("학생 클래스 생성자");
    }
}

/* Output
    휴먼 클래스 생성자
    학생 클래스 생성자
 */