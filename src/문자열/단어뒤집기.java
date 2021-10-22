package 문자열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 단어뒤집기 {

    public List<String> solution(String[] arr) {
        List<String> answer = new ArrayList<>();

        for (String s : arr) {
            answer.add(new StringBuilder(s).reverse().toString());
        }

        return answer;
    }

    public List<String> solution2(String[] arr) {
        List<String> answer = new ArrayList<>();
        for (String s : arr) {
            final char[] chars = s.toCharArray();
            int lt = 0;
            int rt = chars.length - 1;
            while (lt < rt) {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            }
            answer.add(String.valueOf(chars));
        }
        return answer;
    }

    public static void main(String[] args) {
        final 단어뒤집기 T = new 단어뒤집기();
        final Scanner kb = new Scanner(System.in);

        final int n = kb.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.next();
        }

        for (String s : T.solution2(arr)) {
            System.out.println(s);
        }
    }
}
