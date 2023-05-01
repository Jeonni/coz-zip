package section_01.java_컬렉션_Collection.열거형_Enum;

enum Level {
    LOW,
    MEDIUM,
    HIGH
}

/*
    return type: String
    method: name()
    - 열거 객체가 가진 문자열 리턴
    - 리턴되는 문자열은 타입 정의할 때 상수 이름과 동일


    return type: int
    method: ordinal()
    - 열거 객체의 순번(0부터 시작) 리턴
    method: compareTo(비교값)
    - 주어진 매개 값과 비교해서 순번 차이를 리턴

    return type: 열거 타입
    method: valueOf(String name)
    - 주어진 문자열의 열거 객체를 리턴
    method: values()
    - 모든 열거 객체들을 배열로 리턴

 */
public class EnumTest {
    public static void main(String[] args) {
        Level level = Level.MEDIUM;

        Level[] allLevels = Level.values();
        for (Level x : allLevels) {
            System.out.printf("%s = %d%n", x.name(), x.ordinal());
        }
        // LOW 0 MEDIUM 1 HIGH 2

        Level findLevel = Level.valueOf("LOW");
        System.out.println(findLevel);
        System.out.println(Level.LOW == Level.valueOf("LOW"));
        // LOW
        // true

        switch (level) {
            case LOW:
                System.out.println("낮은 레벨");
                break;
            case MEDIUM:
                System.out.println("중간 레벨");
                break;
            case HIGH:
                System.out.println("높은 레벨");
                break;
        }
        // 중간 레벨
    }
}

/* Output
    LOW = 0
    MEDIUM = 1
    HIGH = 2
    LOW
    true
    중간 레벨
 */
