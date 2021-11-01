package 해쉬맵트리;

import java.util.HashMap;
import java.util.Scanner;

public class 학급회장 {

    public Character solution(int n, String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        Character answer = ' ';
        int max = Integer.MIN_VALUE;

        for (char key : str.toCharArray()) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (Character key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        final 학급회장 T = new 학급회장();
        final Scanner kb = new Scanner(System.in);

        final int n = kb.nextInt();
        final String str = kb.next();
        System.out.println(T.solution(n, str));
    }
}
