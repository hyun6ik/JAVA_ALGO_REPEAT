package 문자열;

import java.util.Scanner;

public class 숫자만추출 {

    private static String regex = "(^[0-9]*$)";

    public int solution(String s) {
        int answer = 0;

        return validateNumber(s, answer);
    }

    private int validateNumber(String s, Integer answer) {
        for (char c : s.toCharArray()) {
            if (String.valueOf(c).matches(regex)) {
                answer = answer * 10 + Integer.parseInt(String.valueOf(c));
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        final 숫자만추출 T = new 숫자만추출();
        final Scanner kb = new Scanner(System.in);

        final String s = kb.next();

        System.out.println(T.solution(s));
    }
}
