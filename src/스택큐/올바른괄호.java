package 스택큐;

import java.util.Scanner;
import java.util.Stack;

public class 올바른괄호 {

    public String solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()) {
            return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        final 올바른괄호 T = new 올바른괄호();
        final Scanner kb = new Scanner(System.in);

        final String s = kb.next();

        System.out.println(T.solution(s));
    }
}
