package section_02.자료구조.스택;

import java.util.Stack;

/*
    데이터를 체계적으로 정리하여 저장해두는 것이 데이터를 활용하는데 있어 훨씬 유리
    --> 자료구조를 사용

     특정 상황이 닥쳤을 때, 자료구조를 빠르고 정확하게 적용하여 문제 해결할 수 있음

    스택 (Stack)
    - 데이터를 순서대로 쌓는 자료 구조    ex) 프링글스
    - LIFO(Last In First Out)
    - FILO(First In Last Out)

    push()
    - 스택에서 데이터를 넣는 것

    pop()
    - 스택에서 데이터를 꺼내는 것

    1. 스택을 후입선출 구조를 가지므로, 스택에 저장된 데이터를 가져오는 속도가 매우 빠르다.
    2. 자바에서는 스택을 기본 자료구조로 제공하므로, 별도의 라이브러리나 모듈을 설치할 필요가 없다.

    단점
    1. 크기 제한이 없다.
    2. Stack 클래스는 Vector 클래스를 상속받아 구현되어 있어, 크기를 동적으로 조정하지 않습니다.
    3. Stack 클래스는 Vector 클래스를 상속받아 구현되어 있어, 중간에서 데이터를 삽입, 삭제를 할 수 있게 된다.
 */
public class BracketChecker {
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "([])(){}";
        String s2 = "([)]";
        String s3 = "([](){([])})";
        String s4 = "";

        System.out.println(s1 + " is balanced? " + isBalanced(s1));
        System.out.println(s2 + " is balanced? " + isBalanced(s2));
        System.out.println(s3 + " is balanced? " + isBalanced(s3));
        System.out.println(s4 + " is balanced? " + isBalanced(s4));
    }
}