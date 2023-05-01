package section_01.java_컬렉션_Collection.예외처리_ExceptionHandling;

public class ThrowsExceptionTest {
    public static void main(String[] args) {
        try {
            throwException();
        } catch (ClassNotFoundException e) { // 에러가 발생하면 다음을 예외 정보를 출력
            System.out.println(e.getMessage());
        }
    }

    static void throwException() throws ClassNotFoundException, NullPointerException {
        Class.forName("java.lang.StringX");
    }
}
