package section_02.자료구조.트리.트리순회;

import java.util.ArrayList;

/*
    후위 순회
    - 루트를 가장 마지막에 순회
    - 제일 왼쪽 끝에 있는 노드부터 순회하기 시작
    - 루트를 거치지 않고, 오른쪽으로 이동해 순회한 뒤
    - 제일 마지막에 루트를 방문
    * 주로 트리를 삭제할 때 사용
    * 자식 노드가 먼저 삭제되어야 상위 노드를 삭제할 수 있기 때문
 */
public class postorderTraverse {
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

        public ArrayList<String> postOrder(Node node, ArrayList<String> list) {
            if (node != null) {
                list = postOrder(node.getLeft(), list);
                list = postOrder(node.getRight(), list);
                list.add(node.getData());
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

탐색 종료 시 list의 값 -> ["H", "I", "D", "J", "K", "E", "B", "L", "M", "F", "N", "O", "G", "C", "A"]
 */
