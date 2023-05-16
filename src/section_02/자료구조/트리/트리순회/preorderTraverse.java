package section_02.자료구조.트리.트리순회;

import java.util.ArrayList;

/*
   전위 순회
   - 루트 노드 방문하고
   - 루트에서 시작해 왼쪽의 노드들을 차례로 둘러본 뒤,
   - 왼쪽의 노드 탐색이 끝나면 오른쪽 노드를 탐색
   - 즉, 부모 노드가 제일 먼저 방문되는 순회 방식

   주로 트리르 복사할 때 사용
 */
public class preorderTraverse {
    class Node{
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

        public ArrayList<String> preOrder(Node node, ArrayList<String> list){
            if (node != null) {
                list.add(node.getData());
                list = preOrder(node.getLeft(), list);
                list = preOrder(node.getRight(), list);
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

탐색 종료 시 list의 값 -> ["A", "B", "D", "H", "I", "E", "J", "K", "C", "F", "L", "M", "G", "N", "O"]
 */