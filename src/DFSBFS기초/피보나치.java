package DFSBFS기초;

import java.util.Scanner;

public class 피보나치 {

    public int DFS(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }

        return DFS(n - 2) + DFS(n - 1);
    }

    public static void main(String[] args) {
        final 피보나치 T = new 피보나치();
        final Scanner kb = new Scanner(System.in);

        final int n = kb.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(T.DFS(i) + " ");
        }
    }
}
