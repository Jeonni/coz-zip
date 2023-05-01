package section_01.java_컬렉션_Collection.컬렉션_프레임워크CollectionFramework;

import java.util.TreeSet;

/*
    TreeSet
    - 중복 값 허용 X
    - 저장 순서 유지 X

    Binary Search Tree (이진 탐색 트리)
    - 하나의 부모가 최대 두 개의 자식 노드와 연결되는 이진트리
    - 정렬, 검색에 특화된 자료구조
    - 최상위 노드: 루트
    - 모든 왼쪽 자식의 값: 루트, 부모보다 작은 값을 가짐
    - 모든 오른쪽 자식의 값: 루트, 부모보다 큰 값을 가짐

 */
public class TreeSetExample {
    public static void main(String[] args) {
        // TreeSet 생성
        TreeSet<String> workers = new TreeSet<>();

        // TreeSet에 요소 추가
        workers.add("Lee Java");
        workers.add("Park Hacker");
        workers.add("Kim coding");

        // [Kim coding, Lee Java, Park Hacker]
        System.out.println(workers);

        // Kim coding
        System.out.println(workers.first());

        // Park Hacker
        System.out.println(workers.last());

        // Lee Java
        System.out.println(workers.higher("Lee"));

        // [Kim coding, Lee Java]
        System.out.println(workers.subSet("Kim", "Park"));
    }
}

/*  Output
    [Kim coding, Lee Java, Park Hacker]
    Kim coding
    Park Hacker
    Lee Java
    [Kim coding, Lee Java]


    요소를 추가하기만 했음에도 불구하고, 자동으로 사전 편찬 순에 따라
    오름차순 정렬된 것을 확인할 수 있다.

    이는 TreeSet의 기본 정렬 방식이 '오름차순'이기 때문이다.
 */