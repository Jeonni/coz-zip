package section_02.자료구조.스택.코플릿;

import java.util.ArrayList;


/*
Stack 구현을 위한 기본적인 코드가 작성되어 있습니다. Stack 자료구조의 특성을 이해하고 FILL_ME_IN을 채워 테스트를 통과해 주세요.
 */
public class ImplementationStack {
    public static void main(String[] args) {
        Solution stack = new Solution();
        stack.size();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        stack.pop();
        stack.pop();
        stack.size();
        stack.push(8);
        stack.size();
        stack.peek();
    }

    public static class Solution {
        private ArrayList<Integer> listStack = new ArrayList<Integer>();

        public void push(Integer data) {
            listStack.add(data);
        }

        public Integer pop() {
            if (listStack.size() == 0) {
                return null;
            } else {
                return listStack.remove(listStack.size() - 1);
            }
        }

        public int size() {
            return listStack.size();
        }

        public Integer peek() {
            if (listStack.size() == 0) {
                return null;
            } else {
                return listStack.get(listStack.size() - 1);
            }
        }

        public String show() {
            return listStack.toString();
        }

        public void clear() {
            listStack.clear();
        }
    }

}
