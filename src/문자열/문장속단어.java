package 문자열;

import java.util.Scanner;

public class 문장속단어 {

    public String solution(String s) {
        String result = "";
        final String[] split = s.split(" ");

        for (String s1 : split) {
            if (s1.length() > result.length()) {
                result = s1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        final 문장속단어 T = new 문장속단어();
        final Scanner kb = new Scanner(System.in);

        final String s = kb.nextLine();

        System.out.println(T.solution(s));
    }
}
