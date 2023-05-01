package section_01.java_컬렉션_Collection.열거형_Enum;

/*
    enum (열거형)
    - 서로 연관된 상수들의 집합
    - 사용자 정의 타입이 아니기에 switch 문에 활용할 수 있다.


    자바에서 열거형은 여러 상수들을 보다 편리하게 선언하고 관리할 수 있게 하며
    상수명의 중복을 피하고, 타입에 대한 안정성을 보장한다.
 */
enum Seasons {SPRING, SUMMER, FALL, WINTER}

public class EnumExample {
    public static void main(String[] args) {
        Seasons seasons = Seasons.SPRING;

        switch (seasons) {
            case SPRING:
                System.out.println("봄");
                break;
            case SUMMER:
                System.out.println("여름");
                break;
            case FALL:
                System.out.println("가을");
                break;
            case WINTER:
                System.out.println("겨울");
                break;
        }
    }
}
