package section_01.java_컬렉션_Collection.제네릭_Generic;


/*
    제네릭(Generic)
    - 타입을 구체적으로 지정하는 것이 아닌, 추후에 지정할 수 있도록 일반화 해두는 것
    - 작성한 클래스 또는 메서드 코드가 특정 데이터 타입에 얽매이지 않게 해둔 것
 */

class Basket<T> { // T: 타입 매개변수

    // 제네릭 클래스에서는 타입 매개개변수를 임의의 타입으로 사용할 수 있다.
    // 따라서 클래스 변수에는 타입 매개변수를 사용할 수 없다.
//    static T item; // 오류 발생
    private T item;


    // 타입 매개변수에 치환될 타입으로 기본타입을 지정할 수 없음
    // int, double --> Integer, Double 래퍼 클래스 활용
    Basket<String> basket1 = new Basket<>("Hi");
    Basket<Integer> basket2 = new Basket<>(10);
    Basket<Double> basket3 = new Basket<>(3.14);



    public Basket(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }


    /*
        제네릭 메서드
        - 클래스 내부 특정 메서드만 제네릭으로 선언 가능
        - 제네릭 메서드 타입 매개변수 선언은 반환탕비 앞에서 이루어지며
        - 해당 메서드 내에서만 선언한 타입 매개변수를 사용할 수 있다.

        위에 Basket 클래스에 선언한 타입 매개변수는 클래스가 인스턴스화 할 때 타입이 지정됨
        제네릭 메서드 타입 지정은 메서드가 호출될 때 이루어짐
        -->> 따라서 둘은 서로 다른 매개변수 타입으로 간주된다.
     */
    public <T> void add(T element){
        System.out.println(element);
    }

}
/*
    Basket 클래스는 인스턴스화할 때 어떠한 타입 지정도 가능하다.
    즉, 타입을 지정하는데 있어 제한이 없다.

    그러나 타입 매개변수를 선언할 때,
    Basket 클래스를 인스턴스화 할 시, 타입으로 하위클래스만 지정하도록 제한한다.

    특정 인터페이스를 구현한 클래스만 타입으로 지정할 수 있도록 제한할 수도 있다.
    이 경우에도 동일하게 extends 사용
    ex) class Basket<T extends Plant>{...}

    특정 클래스 상속받으면서 동시에 특정 인터페이스를 구현한 클래스 타입으로 지정할 수 있도록 제한하려면 '&' 사용
    --> 클래스를 인터페이스보다 앞에 위치시켜야 한다.
    ex) interface Plant { ... }
        class Flower implements Plant { ... }
        class Rose extends Flower implements Plant { ... }

        class Basket<T extends Flower & Plant> { ... }

 */