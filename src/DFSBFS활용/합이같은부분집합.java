package DFSBFS활용;

import java.util.Scanner;

public class 합이같은부분집합 {

    private static String answer = "NO";
    private static int n;
    private static int total = 0;
    private static boolean flag = false;

    public void DFS(int Level, int sum, int[] arr) {
        if (flag) {
            return;
        }
        if (Level == n) {
            if ((total - sum) == sum) {
                answer = "YES";
                flag = true;
            }
            return;
        }
        DFS(Level + 1, sum + arr[Level], arr);
        DFS(Level + 1, sum, arr);
    }

    public static void main(String[] args) {
        final 합이같은부분집합 T = new 합이같은부분집합();
        final Scanner kb = new Scanner(System.in);

        n = kb.nextInt();

        final int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
            total += arr[i];
        }
        T.DFS(0, 0, arr);
        System.out.println(answer);

    }
}
