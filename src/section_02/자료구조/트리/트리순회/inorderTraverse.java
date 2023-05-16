package section_02.자료구조.트리.트리순회;

import java.util.ArrayList;

/*
    중위 순회
    - 루트를 가운데 두고 순회
    - 제일 왼쪽 끝에 있는 노드부터 순회하기 시작하여,
    - 루트를 기준으로 왼쪽에 있는 노드의 순회가 끝나면
    - 루트를 걸쳐 오른쪽에 있는 노드로 이동하여 마저 탐색
    * 부모 노드가 서브 트리의 방문 중간에 방문되는 순회 방식
    - 이진 탐색 트리의 오름차순으로 값을 가져올 때 주로 사용
 */
public class inorderTraverse {
    class Node {
        String data;
        Node left;
        Node right;

        public String getData() {
            return data;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        public ArrayList<String> inOrder(Node node, ArrayList<String> list) {
            if (node != null) {
                list = inOrder(node.getLeft(), list);
                list.add(node.getData());
                list = inOrder(node.getRight(), list);
            }
            return list;
        }

    }
}

/*
                   트리 구조
                      A (root)
             B                  C
        D         E        F         G
     H     I   J    K    L    M   N     O

탐색 종료 시 list의 값 -> ["H", "D", "I", "B", "E", "J", "K", "A", "L", "F", "M", "C", "N", "G", "O"]
 */