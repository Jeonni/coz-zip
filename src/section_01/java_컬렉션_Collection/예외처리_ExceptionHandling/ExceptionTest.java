package section_01.java_컬렉션_Collection.예외처리_ExceptionHandling;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            Exception intendedException = new Exception("의도적인 예외 만들기");
            throw intendedException;
        } catch (Exception e) {
            System.out.println("고의로 예외 발생시키기 성공");
        }
    }
}

/*  Output
    고의로 예외 발생시키기 성공
 */