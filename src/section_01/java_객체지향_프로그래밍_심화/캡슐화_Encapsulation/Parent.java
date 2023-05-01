package section_01.java_객체지향_프로그래밍_심화.캡슐화_Encapsulation;


/*
    접근 제어자

    public
    - 접근 제한 없음

    protected
    - 동일 패키지 + 다른 패키지의 하위 클래스에서 접근 가능

    default
   - 동일 패키지 내에서만 접근 가능

    private
    - 동일 클래스에서만 접근 가능


    우리는 접근 제어자를 통해 외부로부터 데이터를 보호하고, 불필요하게 데이터가 노출되는 것을 방지
 */
class Test{
    public static void main(String[] args) {
        Parent p = new Parent();
//        System.out.println(p.a); // 동일 클래스가 아니므로 오류 발생
        System.out.println(p.b);
        System.out.println(p.c);
        System.out.println(p.d);
    }
}
public class Parent {
    private int a = 1;
    int b = 2;
    protected int c = 3;
    public int d = 4;

    public void print(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

/* Output
    2
    3
    4
 */
