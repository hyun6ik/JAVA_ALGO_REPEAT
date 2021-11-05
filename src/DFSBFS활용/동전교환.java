package DFSBFS활용;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 동전교환 {

    private static int n;
    private static int m;
    private static Integer[] arr;
    private static int answer = Integer.MAX_VALUE;

    public void DFS(int count, int sum) {

        if (sum > m) {
            return;
        }
        if (count >= answer) {
            return;
        }
        if (sum == m) {
            answer = Math.min(answer, count);
            return;
        }
        for (int i = 0; i < n; i++) {
            DFS(count + 1, sum + arr[i]);
        }


    }

    public static void main(String[] args) {
        final 동전교환 T = new 동전교환();
        final Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        m = kb.nextInt();

        T.DFS(0, 0);
        System.out.println(answer);

    }
}
