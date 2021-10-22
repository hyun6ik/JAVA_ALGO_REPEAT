package 문자열;

import java.util.Scanner;

public class 대소문자변환 {

    private String solution(String n) {
        StringBuilder result = new StringBuilder();
        for (char c : n.toCharArray()) {
            if (65 < c && 97 > c) {
                result.append(String.valueOf(c).toLowerCase());
            }
            else {
                result.append(String.valueOf(c).toUpperCase());
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        final 대소문자변환 T = new 대소문자변환();
        final Scanner kb = new Scanner(System.in);

        final String n = kb.next();

        System.out.println(T.solution(n));
    }


}
