package section_01.java_객체지향_프로그래밍_심화.캡슐화_Encapsulation;



/*
    Getter 메서드 Setter 메서드
    - 객체지향의 캡슐화 목적을 달성하면서도 데이터 변경이 필요한 경우 사용

    Setter 메서드
    - 외부에서 메서드에 접근하여 조건에 맞을 경우 데이터 값을 변경할 수 있게 해줌
    - 일반적으로 메서드명 set- 붙여서 정의

    Getter 메서드
    - 설정한 변수값을 읽어오는데 사용

    setter, getter 메서드 활용하면 데이터를 효과적으로 보호하면서도
    의도하는 값으로 변경하여 캡슐화를 효과적으로 달성할 수 있다.
 */
public class GetterSetterTest {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.setName("김코딩");
        worker.setAge(15);
        worker.setId(1);

        String name = worker.getName();
        System.out.println("근로자 이름: " + name);
        int age = worker.getAge();
        System.out.println("근로자 나이: " + age);
        int id = worker.getId();
        System.out.println("근로자 id: " + id);
    }
}

class Worker {
    private String name; // 변수 은닉화, 외부로부터 접근 불가
    private int age;
    private int id;

    public String getName() { // 멤버변수의 값
        return name;
    }

    public void setName(String name) { // 멤버변수의 값 변경
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) { // 멤버변수의 값 변경
        if (age < 1) return;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) { // 멤버변수의 값 변경
        this.id = id;
    }
}