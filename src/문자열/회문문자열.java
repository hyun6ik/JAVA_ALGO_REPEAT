package 문자열;

import java.util.Scanner;

public class 회문문자열 {

    private static final String YES = "YES";
    private static final String NO = "NO";

    public String solution(String s) {
        final char[] arr = s.toCharArray();
        int lt = 0;
        int rt = arr.length - 1;

        while (lt < rt) {
            if (!String.valueOf(arr[lt]).equalsIgnoreCase(String.valueOf(arr[rt]))) {
                return NO;
            }
            lt++;
            rt--;
        }
        return YES;
    }

    public static void main(String[] args) {
        final 회문문자열 T = new 회문문자열();
        final Scanner kb = new Scanner(System.in);

        final String s = kb.next();

        System.out.println(T.solution(s));
    }
}
