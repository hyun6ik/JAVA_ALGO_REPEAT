package 문자열;

import java.util.Scanner;

public class 유명한펠린드롬 {

    private static final String YES = "YES";
    private static final String NO = "NO";

    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                answer.append(c);
            }
        }
        final String reverse = new StringBuilder(answer.toString()).reverse().toString();
        if (answer.toString().equalsIgnoreCase(reverse)) {
            return YES;
        }
        return NO;
    }

    public static void main(String[] args) {
        final 유명한펠린드롬 T = new 유명한펠린드롬();
        final Scanner kb = new Scanner(System.in);

        final String s = kb.nextLine();

        System.out.println(T.solution(s));
    }
}
