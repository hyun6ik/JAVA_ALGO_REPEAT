package 정렬검색기본;

import java.util.Scanner;

public class LRU {

    public int[] solution(int[] arr, int s, int n) {
        final int[] cache = new int[s];
        for (int x : arr) {
            int pos = -1;
            for (int i = 0; i < s; i++) {
                if (x == cache[i]) {
                    pos = i;
                }
            }
            if (pos == -1) {
                for (int i = s - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
                cache[0] = x;
            } else {
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
                cache[0] = x;
            }
        }
        return cache;
    }

    public static void main(String[] args) {
        final LRU T = new LRU();
        final Scanner kb = new Scanner(System.in);

        final int s = kb.nextInt();
        final int n = kb.nextInt();
        final int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = kb.nextInt();
        }
        for (int i : T.solution(arr, s, n)) {
            System.out.print(i + " ");
        }
    }
}
