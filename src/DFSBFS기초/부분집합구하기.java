package DFSBFS기초;

import java.util.Scanner;

public class 부분집합구하기 {

    static int n;
    static int[] arr;

    public void DFS(int L) {
        if (L == n + 1) {
            String answer = "";
            for (int i = 1; i <= n; i++) {
                if (arr[i] == 1) {
                    answer += (i + " ");
                }
            }
            if (answer.length() > 0) {
                System.out.println(answer);
            }
        } else {
            arr[L] = 1;
            DFS(L + 1);
            arr[L] = 0;
            DFS(L + 1);
        }

    }

    public static void main(String[] args) {
        final 부분집합구하기 T = new 부분집합구하기();
        final Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        arr = new int[n + 1];
        T.DFS(1);
    }
}
