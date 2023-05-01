package section_01.java_컬렉션_Collection.컬렉션_프레임워크CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

/*
    Set
    - 데이터 중복 허용 X
    - 데이터 저장 순서 유지 X

    HashSet
    - Set 인터페이스를 구현한 가장 대표적인 컬렉션 클래스
    - 중복된 갑 허용 X
    - 저장 순서 유지 X
 */
public class SetExample {
    public static void main(String[] args) {

        // HashSet 생성
        HashSet<String> languages = new HashSet<String>();

        // HashSet에 객체 추가
        languages.add("Java");
        languages.add("Python");
        languages.add("Javascript");
        languages.add("C++");
        languages.add("Kotlin");
        languages.add("Ruby");
        languages.add("Java"); // 중복


        // 반복자 생성하여 it에 할당
        Iterator it = languages.iterator();


        // 반복자를 통해 HashSet을 순회하며 각 요소들 출력
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}

/*  Output - HashSet과 Iterator을 통해 중복된 값을 제거
    Java
    C++
    Javascript
    Ruby
    Python
    Kotlin
 */