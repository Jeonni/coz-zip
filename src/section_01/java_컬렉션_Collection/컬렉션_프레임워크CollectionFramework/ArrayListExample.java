package section_01.java_컬렉션_Collection.컬렉션_프레임워크CollectionFramework;

import java.util.ArrayList;

/*
    ArrayList
    - 객체가 인덱스로 관리된다는 점에 배열과 유사
    - 배열의 크기 자동으로 설정
    - 데이터가 연속적으로 존재
    - 특정 인덱스 제거 시, 바로 뒤 인덱스부터 마지막 인덱스까지 1씩 앞당겨짐
    - 빈번한 객체 삭제, 삽입 일어날 시엔 LinkedList 사용이 적합
 */
public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList 생성하여 list에 할당
        ArrayList<String> list = new ArrayList<>();

        // String 타입 데이터를 ArrayList에 추가
        list.add("java");
        list.add("egg");
        list.add("tree");

        // 저장된 총 객체 수 얻기
        int size = list.size();

        // 0번 인덱스의 객체 얻기
        String skill = list.get(0);

        // 저장된 총 객체 수만큼 조회
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + " : " + str);
        }

        // for-each 문으로 순회
        for(String str : list){
            System.out.println(str);
        }

        // 0번 인덱스 객체 삭제
        list.remove(0);
    }
}
