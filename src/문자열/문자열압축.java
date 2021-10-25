package 문자열;

import java.util.Scanner;

public class 문자열압축 {

    public String solution(String s) {
        final StringBuilder answer = new StringBuilder();

        s += " ";
        final char[] c = s.toCharArray();
        int lt = 0;
        int rt = s.length()-1;
        int p = 1;

        while (lt < rt) {
            if (c[lt] != c[lt + 1]) {
                answer.append(c[lt]);
                if (p > 1) {
                    answer.append(p);
                    p = 1;
                }
            } else {
                p++;
            }
            lt++;
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        final 문자열압축 T = new 문자열압축();
        final Scanner kb = new Scanner(System.in);

        final String s = kb.next();

        System.out.println(T.solution(s));
    }
}
