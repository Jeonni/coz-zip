package section_01.java_객체지향_프로그래밍_심화.추상화_Abstraction;


interface Customer{
    public abstract String getOrder();
}

// 손님A,B에 각각 Customer 인터페이스 구현
class CafeCustomerA implements Customer{
    public String getOrder(){
        return "바닐라 라떼";
    }
}

class CafeCustomerB implements Customer{
    public String getOrder(){
        return "딸기라떼";
    }
}

// 카페 사장님
class CafeOwner{
    public void giveItem(Customer customer){
        System.out.println("손님, 주문하신 " + customer.getOrder() + " 나왔습니다.");
    }
}

// 메뉴 주문
public class OrderExample {
    public static void main(String[] args) {
        CafeOwner cafeOwner = new CafeOwner();
        Customer cafeCustomerA = new CafeCustomerA();
        Customer cafeCustomerB = new CafeCustomerB();

        cafeOwner.giveItem(cafeCustomerA);
        cafeOwner.giveItem(cafeCustomerB);
    }
}
