package 문자열;

import java.util.Scanner;

public class 문자찾기 {

    private int solution(String input, String n) {
        int result = 0;
        for (char c : input.toCharArray()) {
            if (String.valueOf(c).equalsIgnoreCase(n)) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        final 문자찾기 T = new 문자찾기();
        final Scanner kb = new Scanner(System.in);

        final String input = kb.next();
        final String n = kb.next();

        System.out.println(T.solution(input, n));
    }


}
