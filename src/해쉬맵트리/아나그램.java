package 해쉬맵트리;

import java.util.HashMap;
import java.util.Scanner;

public class 아나그램 {

    private static final String YES = "YES";
    private static final String NO = "NO";

    public String solution(String str1, String str2) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char key : str1.toCharArray()) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (char key : str2.toCharArray()) {
            if (!map.containsKey(key) || map.get(key) == 0) {
                return NO;
            }
            map.put(key, map.get(key) -1);
        }
        return YES;
    }

    public static void main(String[] args) {
        final 아나그램 T = new 아나그램();
        final Scanner kb = new Scanner(System.in);

        final String str1 = kb.next();
        final String str2 = kb.next();

        System.out.println(T.solution(str1, str2));
    }

}
