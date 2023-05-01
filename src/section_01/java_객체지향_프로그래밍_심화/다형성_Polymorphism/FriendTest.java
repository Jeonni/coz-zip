package section_01.java_객체지향_프로그래밍_심화.다형성_Polymorphism;


/*
    다형성(Polymorphism)
    - 하나의 객체가 여러 가지 형태를 가질 수 있는 성질

    자바에서의 다형성이란?
    - 한 타입의 참조 변수를 통해 여러 타입의 객체를 참조할 수 있도록 만든 것
    - 상위 클래스 타입의 참조 변수를 통해서 하위 클래스의 객체를 참조할 수 있도록 허용한 것
 */


class Friend {
    public void friendInfo() {
        System.out.println("나는 당신의 친구입니다.");
    }
}

class BoyFriend extends Friend {

    public void friendInfo() {
        System.out.println("나는 당신의 남자친구입니다.");
    }
}

class GirlFriend extends Friend {

    public void friendInfo() {
        System.out.println("나는 당신의 여자친구입니다.");
    }
}

public class FriendTest {

    public static void main(String[] args) {
        Friend friend = new Friend(); // 객체 타입과 참조 변수 타입의 일치
        BoyFriend boyfriend = new BoyFriend();
        Friend girlfriend = new GirlFriend(); // 객체 타입과 참조 변수 타입의 불일치

        friend.friendInfo();
        boyfriend.friendInfo();
        girlfriend.friendInfo();
    }
}

/* Output
    나는 당신의 친구입니다.
    나는 당신의 남자친구입니다.
    나는 당신의 여자친구입니다.
 */