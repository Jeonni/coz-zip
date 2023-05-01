package section_01.java_객체지향_프로그래밍_심화.추상화_Abstraction;

abstract class Animals { // 추상 클래스
    public abstract void cry();

    public abstract void name();
}

interface Pet { // 인터페이스
    public abstract void play();
}

class Cow extends Animals implements Pet { // Animal 클래스 상속 & Pet 인터페이스 구현

    public void name() {
        System.out.println("소 --");
    }

    public void cry() { // 메서드 오버라이딩
        System.out.println("음메");
    }

    public void play() { // 메서드 오버라이딩
        System.out.println("여물 먹기");
    }
}

class Chick extends Animals implements Pet { // Animal 클래스 상속 & Pet 인터페이스 구현

    public void name() {
        System.out.println("병아리 --");
    }

    public void cry() {
        System.out.println("삐약삐약");
    }

    public void play() {
        System.out.println("지렁이 먹기");
    }
}

public class MultiInheritance {
    public static void main(String[] args) {
        Cow cow = new Cow();
        Chick chick = new Chick();

        cow.name();
        cow.cry();
        cow.play();

        chick.name();
        chick.cry();
        chick.play();
    }
}

/* Output
소 --
음메
여물 먹기
병아리 --
삐약삐약
지렁이 먹기

 */