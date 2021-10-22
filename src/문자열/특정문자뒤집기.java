package 문자열;

import java.util.Scanner;

public class 특정문자뒤집기 {

    public String solution(String s) {
        final char[] arr = s.toCharArray();
        int lt = 0;
        int rt = s.length() -1;
        while (lt < rt) {
            if (!Character.isAlphabetic(arr[lt])) {
                lt++;
            }
            else if (!Character.isAlphabetic(arr[rt])) {
                rt--;
            }
            else {
                char temp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = temp;
                lt++;
                rt--;
            }

        }
        return String.valueOf(arr);
    }



    public static void main(String[] args) {
        final 특정문자뒤집기 T = new 특정문자뒤집기();
        final Scanner kb = new Scanner(System.in);

        final String s = kb.next();

        System.out.println(T.solution(s));
    }
}
