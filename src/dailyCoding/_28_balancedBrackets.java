package dailyCoding;

import java.util.HashMap;
import java.util.Stack;

public class _28_balancedBrackets {
    public static void main(String[] args) {
        boolean output = balancedBrackets(")(");
        System.out.println(output); // // -> false

        output = balancedBrackets("()");
        System.out.println(output); // --> true

        output = balancedBrackets("())()(()");
        System.out.println(output); // --> false

    }

    public static boolean balancedBrackets(String str) {
        // TODO: 문자열을 입력받아 문자열 내의 모든 괄호의 짝이 맞는지 여부를 리턴해야 합니다.
        /*
            다음 단계에 맞춰 함수를 작성해 보세요
                1. 괄호의 종류를 단 한가지로 한정합니다.
                2. 괄호의 종류를 늘려 모든 종류의 괄호에도 작동하도록 합니다.
                3. 괄호를 제외한 문자열이 포함된 경우에도 작동하도록 합니다.
                4. 괄호는 닫힌 괄호 ), ], } 가 시작되면, 이후로 추가적인 열린 괄호가 앞에 존재하지 않은 경우 닫힌 괄호가 입력될 수 없습니다 (이럴 경우 실패)
                ex) balancedBrackets ')(' 혹은 balancedBrackets '())()(()'과 같은 입력은 항상 false입니다.
         */
        Stack<Character> stack = new Stack<>();
        char[] bList = { '(', ')', '{', '}', '[', ']' };

        for (char c : str.toCharArray()) {
            if (c == bList[1] && !stack.isEmpty() && stack.peek() == bList[0]) {
                stack.pop();
            } else if (c == bList[3] && !stack.isEmpty() && stack.peek() == bList[2]) {
                stack.pop();
            } else if (c == bList[5] && !stack.isEmpty() && stack.peek() == bList[4]) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
