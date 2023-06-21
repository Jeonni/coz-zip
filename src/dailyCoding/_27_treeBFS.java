package dailyCoding;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _27_treeBFS {
    public static void main(String[] args) {
        tree root = new tree("1");

        tree rootChild1 = root.addChildNode(new tree("2"));
        tree rootChild2 = root.addChildNode(new tree("3"));

        tree leaf1 = rootChild1.addChildNode(new tree("4"));
        tree leaf2 = rootChild2.addChildNode(new tree("5"));

        ArrayList<String> output = bfs(root);
        System.out.println(output); // --> ["1", "2", "3", "4", "5"]

        leaf1.addChildNode(new tree("6"));
        rootChild2.addChildNode(new tree("7"));

        output = bfs(root);
        System.out.println(output); // --> ["1", "2", "3", "4", "5", "7", "6"]
    }

    public static ArrayList<String> bfs(tree node) {
        /* TODO: 임의의 tree를 구성하는 노드 중 하나의 Node 객체를 입력받아, 해당 노드를 시작으로 너비 우선 탐색(BFS, Breadth First Search)을 합니다.
            이 때, 탐색되는 순서대로 노드의 값이 저장된 배열을 리턴해야 합니다.
         */

        Queue<tree> queue = new LinkedList<>();
        ArrayList<String> values = new ArrayList<>();

        queue.offer(node);

        while (queue.size() > 0) {
            tree currentNode = queue.poll();
            values.add(currentNode.getValue());

            if(currentNode.getChildrenNode()!=null){
                queue.addAll(currentNode.getChildrenNode());
            }
        }

        return values;
    }

    public static class tree {
        private String value;
        private ArrayList<tree> children;

        public tree(String data) {
            this.value = data;
            this.children = null;
        }

        public tree addChildNode(tree node) {
            if (children == null) children = new ArrayList<>();
            children.add(node);
            return children.get(children.size() - 1);
        }

        public String getValue() {      //현재 노드의 데이터를 반환
            return value;
        }

        public ArrayList<tree> getChildrenNode() {
            return children;
        }
    }
}
