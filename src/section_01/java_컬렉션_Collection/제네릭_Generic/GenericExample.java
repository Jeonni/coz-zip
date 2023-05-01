package section_01.java_컬렉션_Collection.제네릭_Generic;


/*
    와일드 카드
    - 어떤 타입으로도 대체될 수 있는 타입 파라미터
    - 기호 ? 로 사용할 수 있음

    <? extends T>
    - 와일드카드에 상한 제한을 두는 것
    - T와 T를 상속받는 하위 클래스 타입만 타입 파라미터로 받을 수 있도록 지정

    <? super T>
    - 와일드카드에 하한 제한을 두는 것
    - T와 T의 상위 클래스만 타입 파라미터로 받도록 지정

    extends 와 super 키워드와 조합하지 은 와일드 카드<?>는 <? extends Object>와 같다.
    -> 모든 클래스 타입은 Object 클래스를 상속 받으므로, 모든 클래스 타입을 타입 파라미터로 받을 수 있다.
 */

class Phone {
}

class IPhone extends Phone {
}

class Galaxy extends Phone {
}

class IPhone12Pro extends IPhone {
}

class IPhoneXS extends IPhone {
}

class S22 extends Galaxy {
}

class ZFlip extends Galaxy {
}

class User<T> {
    public T phone;

    public User(T phone) {
        this.phone = phone;
    }
}

class PhoneFunction {
    public static void call(User<? extends Phone> user) {
        System.out.println("-".repeat(60));
        System.out.println("user.phone: " + user.phone.getClass().getSimpleName());
        System.out.println("모든 Phone은 통화할 수 있다.");
    }

    public static void faceId(User<? extends IPhone> user) {
        System.out.println("-".repeat(60));
        System.out.println("user.phone: " + user.phone.getClass().getSimpleName());
        System.out.println("IPhone만 Face ID를 사용할 수 있다.");
    }

    public static void samsungPay(User<? extends Galaxy> user) {
        System.out.println("-".repeat(60));
        System.out.println("user.phone: " + user.phone.getClass().getSimpleName());
        System.out.println("Galaxy만 삼성 페이를 사용할 수 있다.");
    }

    public static void recordVoice(User<? super Galaxy> user) {
        System.out.println("-".repeat(60));
        System.out.println("user.phone: " + user.phone.getClass().getSimpleName());
        System.out.println("안드로이드 폰에서만 통화 녹음이 가능하다.");
    }
}

public class GenericExample {
    public static void main(String[] args) {
        PhoneFunction.call(new User<Phone>(new Phone()));
        PhoneFunction.call(new User<IPhone>(new IPhone()));
        PhoneFunction.call(new User<Galaxy>(new Galaxy()));
        PhoneFunction.call(new User<IPhone12Pro>(new IPhone12Pro()));
        PhoneFunction.call(new User<IPhoneXS>(new IPhoneXS()));
        PhoneFunction.call(new User<S22>(new S22()));
        PhoneFunction.call(new User<ZFlip>(new ZFlip()));

        System.out.println("\n-----------------------------\n");
//        PhoneFunction.faceId(new User<Phone>(new Phone())); // X
        PhoneFunction.faceId(new User<IPhone>(new IPhone()));
        PhoneFunction.faceId(new User<IPhone12Pro>(new IPhone12Pro()));
        PhoneFunction.faceId(new User<IPhoneXS>(new IPhoneXS()));

//        PhoneFunction.faceId(new User<Galaxy>(new Galaxy())); // X
//        PhoneFunction.faceId(new User<S22>(new S22())); // X
//        PhoneFunction.faceId(new User<ZFlip>(new ZFlip())); // X

//        PhoneFunction.samsungPay(new User<Phone>(new Phone())); // X
//        PhoneFunction.samsungPay(new User<IPhone>(new IPhone())); // X
//        PhoneFunction.samsungPay(new User<IPhone12Pro>(new IPhone12Pro())); // X
//        PhoneFunction.samsungPay(new User<IPhoneXS>(new IPhoneXS())); // X
        PhoneFunction.samsungPay(new User<Galaxy>(new Galaxy()));
        PhoneFunction.samsungPay(new User<S22>(new S22()));
        PhoneFunction.samsungPay(new User<ZFlip>(new ZFlip()));

        PhoneFunction.recordVoice(new User<Phone>(new Phone()));
//        PhoneFunction.recordVoice(new User<IPhone>(new IPhone())); // X
//        PhoneFunction.recordVoice(new User<IPhone12Pro>(new IPhone12Pro())); // X
//        PhoneFunction.recordVoice(new User<IPhoneXS>(new IPhoneXS())); // X
        PhoneFunction.recordVoice(new User<Galaxy>(new Galaxy()));
//        PhoneFunction.recordVoice(new User<S22>(new S22())); // X
//        PhoneFunction.recordVoice(new User<ZFlip3>(new ZFlip3())); // X

    }
}
