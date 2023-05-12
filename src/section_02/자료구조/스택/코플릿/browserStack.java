package section_02.자료구조.스택.코플릿;

import java.util.ArrayList;
import java.util.Stack;

public class browserStack {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] actions = new String[]{"B", "C", "-1", "D", "A", "-1", "1", "-1", "-1"};
        String start = "A";
        ArrayList<Stack> output = solution.browserStack(actions, start);

        System.out.println(output); // [["A"], ["B"], ["A", "D"]]

        String[] actions2 = new String[]{"B", "-1", "B", "A", "C", "-1", "-1", "D", "-1", "1", "E", "-1", "-1", "1"};
        String start2 = "A";
        ArrayList<Stack> output2 = solution.browserStack(actions2, start2);

        System.out.println(output2); // [["A", "B"], ["D"], ["E"]]
    }

    public static class Solution {
        public ArrayList<Stack> browserStack(String[] actions, String start) {
            Stack<String> prevStack = new Stack<>();
            Stack<String> nextStack = new Stack<>();
            Stack<String> current = new Stack<>();
            ArrayList<Stack> result = new ArrayList<>();

            // 현재 창에 시작 데이터를 담음
            current.add(start);

            for (int i = 0; i < actions.length; i++) {
                // 뒤로가기 버튼을 눌렀을 경우
                if (actions[i].equals("-1") && !prevStack.isEmpty()) { // 뒤로 가기 버튼을 눌렀고, prev stack 이 비어있지 않은 경우
                    // prev stack 에서 삭제한 데이터를 prevPage 변수에 저장
                    String prevPage = prevStack.pop();
                    // next stack 에 현재 페이지였던 데이터를 담음
                    nextStack.push(current.pop());
                    // 현재 창에 prevPage에 담긴 데이터를 보여줌
                    current.push(prevPage);
                } else if (actions[i].equals("1") && !nextStack.isEmpty()) { // 앞으로 가기 버튼을 눌렀고, next stack 이 비어있지 않은 경우
                    // next stack 에서 삭제한 데이터를 nextPage 변수에 저장
                    String nextPage = nextStack.pop();
                    // prev stack 에 현재 페이지였던 데이터를 담음
                    prevStack.push(current.pop());
                    // 현재 창에 nextPage 에 담긴 데이터를 보여줌
                    current.push(nextPage);
                } else if (actions[i].equals("1") || actions[i].equals("-1")) { // 앞으로 가기, 뒤로 가기 버튼이 비활성화일 경우, 스택에 push 하지 않음
                } else { // 앞으로 가기나 뒤로 가기가 아닌 경우, 새로운 페이지 취급
                    // prev stack 에 최근 페이지에 있다가 삭제한 데이터를 담음
                    prevStack.push(current.pop());
                    // current 에 새로 들어온 데이터를 담음
                    current.add(actions[i]);
                    // next stack 을 비워 놓음
                    nextStack.clear();
                }
            }
            result.add(prevStack);
            result.add(current);
            result.add(nextStack);

            return result;
        }
    }
}