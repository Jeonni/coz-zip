package section_01.java_객체지향_프로그래밍_심화.상속_Inheritance;


/*
    메서드 오버라이딩
    - 상위 클래스로부터 상속받은 메서드와 동일한 이름의 메서드를 재정의 하는 것
    - 상위 클래스 매서드 오버라이딩에 필요한 세 가지 조건
    1. 메서드의 선언부 (메서드 이름, 매개변수, 반환타입)이 상위 클래스와 일치해야 함
    2. 접근 제어자의 범위가 상위 클래스와 같거나 넓어야 함
    3. 예외는 상위 클래스의 메서드보다 많이 선언할 수 없다.
 */
public class methodOverriding {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run();

        Bike bike = new Bike();
        Car car = new Car();
        MotorBike motorBike = new MotorBike();

        bike.run();
        car.run();
        motorBike.run();
    }
}


class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    // 상위 클래스 Vehicle에서 상속받은 메서드와 동일한 이름의 메서드를 재정의
    void run() {
        System.out.println("자전거가 달린다.");
    }
}

class Car extends Vehicle {
    // 상위 클래스 Vehicle에서 상속받은 메서드와 동일한 이름의 메서드를 재정의
    void run() {
        System.out.println("자동차가 달린다.");
    }
}

class MotorBike extends Vehicle {
    // 상위 클래스 Vehicle에서 상속받은 메서드와 동일한 이름의 메서드를 재정의
    void run() {
        System.out.println("오토바이가 달린다.");
    }
}

/* Output
    Vehicle is running
    자전거가 달린다.
    자동차가 달린다.
    오토바이가 달린다.
 */