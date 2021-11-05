package DFSBFS활용;

import java.util.Scanner;
import java.util.logging.Level;

public class 중복순열구하기 {

    private static int n;
    private static int m;
    private static int[] arr;

    public void DFS(int Level) {
        if (Level == m) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= n; i++) {
            arr[Level] = i;
            DFS(Level + 1);
        }
    }

    public static void main(String[] args) {
        final 중복순열구하기 T = new 중복순열구하기();
        final Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();
        arr = new int[m];

        T.DFS(0);
    }
}
