package 스택큐;

import java.util.Scanner;
import java.util.Stack;

public class 괄호문자제거 {

    public String solution(String s) {
        final StringBuilder answer = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == ')') {
                while (stack.pop() != '(');
            } else {
                stack.push(c);
            }
        }
        for (Character character : stack) {
            answer.append(character);
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        final 괄호문자제거 T = new 괄호문자제거();
        final Scanner kb = new Scanner(System.in);

        final String s = kb.next();

        System.out.println(T.solution(s));
    }
}
