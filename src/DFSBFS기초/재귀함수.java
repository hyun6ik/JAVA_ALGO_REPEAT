package DFSBFS기초;

import java.util.Scanner;

public class 재귀함수 {

    public void DFS(int n) {
        if (n == 0) {
            return;
        }
        DFS(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        final 재귀함수 T = new 재귀함수();
        final Scanner kb = new Scanner(System.in);

        final int n = kb.nextInt();

        T.DFS(3);
    }
}
