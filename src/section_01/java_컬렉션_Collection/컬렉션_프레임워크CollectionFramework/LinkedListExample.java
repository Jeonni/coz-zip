package section_01.java_컬렉션_Collection.컬렉션_프레임워크CollectionFramework;

import java.util.LinkedList;

/*
    LinkedList
    - 데이터를 효율적으로 추가, 삭제, 변경하기 위해 사용
    - 데이터를 중간에 추가하는 경우
    - Prev와 Next의 주소값만 변경하여 중간에 넣어줄 수 있다.
    - 데이터 검색에 있어서는 ArrayList 보다 느리다.
 */
public class LinkedListExample {
    public static void main(String[] args) {
        // Linked List 생성하여 list에 할당
        LinkedList<String> list = new LinkedList<>();

        // String 타입의 데이터를 LinkedList에 추가
        list.add("java");
        list.add("egg");
        list.add("tree");

        // 저장된 총 객체 수 얻기
        int size = list.size();

        // 0번 인덱스 객체 얻기
        String skill = list.get(0);


        // 저장된 총 객체 수만큼 조회
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + ":" + str);
        }

        // for-each 문으로 순회
        for (String str : list) {
            System.out.println(str);
        }

        // 0번 인덱스 객체 삭제
        list.remove(0);
    }
}
