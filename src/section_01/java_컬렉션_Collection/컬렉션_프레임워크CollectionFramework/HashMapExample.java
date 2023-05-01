package section_01.java_컬렉션_Collection.컬렉션_프레임워크CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    Map
    - 키와 값으로 구성된 객체를 저장하는 구조
    - 이 객체를 Entry 객체라고 한다.
    - Entry 객체는 키와 값을 각각 Key, value 객체로 저장
    - 키는 중복 저장 X
    - 값은 중복 저장 가능
    - 만약 기존에 저장된 키와 같은 키로 값을 저장하면, 기존의 값을 새롭게 대치


    HashMap
    - Map 인터페이스 구현한 대표적인 클래스
    - 해시 함수를 통해 키, 값 저장되는 위치 결정
    - 사용자는 위치를 알 수 없고, 삽입되는 순서 위치도 관계 없음
    - 해싱(Hashing) 사용하기 때문에 많은 양의 데이터 검색에 뒤어남

 */
public class HashMapExample {
    public static void main(String[] args) {
        // HashMap 생성
        HashMap<String, Integer> map = new HashMap<>();

        // Entry 객체 저장
        map.put("피카츄", 85);
        map.put("꼬부기", 95);
        map.put("야도란", 75);
        map.put("파이리", 65);
        map.put("피존투", 15);

        // 저장된 총 Entry 수 읽기
        System.out.println("총 Entry 수: " + map.size());

        // 객체 찾기
        System.out.println("파이리: " + map.get("파이리"));

        // key를 요소로 가지는 Set 생성
        Set<String> keySet = map.keySet();

        // keySet을 순회하면서 value를 읽어온다.
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println(key + ": " + value);
        }

        // 객체 삭제
        map.remove("피존투");

        // 총 Entry 수
        System.out.println("총 Entry 수: " + map.size());

        // Entry 객체를 요소로 가지는 Set 생성
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        // entrySet 순회하면서 value 읽어오기
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey(); // Map.Entry 인터페이스의 메서드
            Integer value = entry.getValue(); // Map.Entry 인터페이스의 메서드
            System.out.println(key + ": " + value);
        }

        // 객체 전체 삭제
        map.clear();
    }
}

/*
    Map은 키와 값을 쌍으로 저장하기 때문에 iterator()를 직접 호출할 수 없습니다.
    그 대신 keySet()이나 entrySet() 메서드를 이용해 Set 형태로 반환된 컬렉션에
    iterator()를 호출하여 반복자를 만든 후, 반복자를 통해 순회할 수 있습니다.
 */