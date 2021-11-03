package 스택큐;

import java.util.Scanner;
import java.util.Stack;

public class 후위식연산 {

    public Integer solution(String s) {
        Stack<Integer> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '+') {
                final Integer n1 = stack.pop();
                final Integer n2 = stack.pop();
                final int result = n2 + n1;
                stack.push(result);
            } else if (c == '-') {
                final Integer n1 = stack.pop();
                final Integer n2 = stack.pop();
                final int result = n2 - n1;
                stack.push(result);
            } else if (c == '*') {
                final Integer n1 = stack.pop();
                final Integer n2 = stack.pop();
                final int result = n2 * n1;
                stack.push(result);
            } else if (c == '/') {
                final Integer n1 = stack.pop();
                final Integer n2 = stack.pop();
                final int result = n2 / n1;
                stack.push(result);
            } else {
                stack.push(c - 48);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        final 후위식연산 T = new 후위식연산();
        final Scanner kb = new Scanner(System.in);

        final String s = kb.next();

        System.out.println(T.solution(s));
    }
}
