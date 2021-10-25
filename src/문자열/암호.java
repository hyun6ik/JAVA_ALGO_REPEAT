package 문자열;

import java.util.Scanner;

public class 암호 {

    public String solution(int n, String s) {
        final StringBuilder answer = new StringBuilder();

        for (int i = 0; i < n; i++) {
            final String temp = s.substring(0, 7).replace('#', '1').replace('*', '0');
            final int number = Integer.parseInt(temp,2);
            final char ascii = (char) number;
            answer.append(ascii);
            s = s.substring(7);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        final 암호 T = new 암호();
        final Scanner kb = new Scanner(System.in);

        final int n = kb.nextInt();
        final String s = kb.next();

        System.out.println(T.solution(n,s));

    }


}
