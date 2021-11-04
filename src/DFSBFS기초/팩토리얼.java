package DFSBFS기초;

import java.util.Scanner;

public class 팩토리얼 {

    private static int answer = 1;

    public int DFS(int n) {
        if (n == 1) {
            return 1;
        }
        return n * DFS(n - 1);
    }

    public static void main(String[] args) {
        final 팩토리얼 T = new 팩토리얼();
        final Scanner kb = new Scanner(System.in);

        final int n = kb.nextInt();

        System.out.println(T.DFS(n));
    }
}
