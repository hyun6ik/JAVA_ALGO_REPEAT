package DFSBFS기초;

import java.util.Scanner;

public class 이진수출력 {

    public void DFS(int n) {
        if (n == 0) {
            return;
        }
        DFS(n/2);
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        final 이진수출력 T = new 이진수출력();
        final Scanner kb = new Scanner(System.in);

        final int n = kb.nextInt();

        T.DFS(n);
    }
}
