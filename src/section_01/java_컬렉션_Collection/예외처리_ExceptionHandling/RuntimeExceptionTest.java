package section_01.java_컬렉션_Collection.예외처리_ExceptionHandling;

public class RuntimeExceptionTest {
    public static void main(String[] args) {

        try {
            System.out.println("소문자 알파벳을 대문자로 출력하는 프로그램");
            printMyName(null);
            printMyName("abc");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException 발생");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException 발생");
            // 예외 정보 얻는 방법 (1)
            System.out.println("e.getMessage: " + e.getMessage());
            // 예외 정보 얻는 방법 (2)
            System.out.println("e.toString: " + e.toString());
            // 예외 정보 얻는 방법 (3)
            e.printStackTrace();
        } finally {
            System.out.println("프로그램 종료");
        }
    }

    static void printMyName(String str) {
        String upperCase = str.toUpperCase();
        System.out.println(upperCase);
    }
}
