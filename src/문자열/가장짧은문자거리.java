package 문자열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 가장짧은문자거리 {

    public int[] solution(String s, char t) {

        final int[] answer = new int[s.length()];
        int p = 1000;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            } else{
                p++;
                answer[i] = p;
            }
        }
        p = 1000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        final 가장짧은문자거리 T = new 가장짧은문자거리();
        final Scanner kb = new Scanner(System.in);

        final String s = kb.next();
        final char t = kb.next().charAt(0);

        for (Integer integer : T.solution(s, t)) {
            System.out.print(integer + " ");
        }
    }


}
