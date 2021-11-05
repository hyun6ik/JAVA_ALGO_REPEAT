package DFSBFS활용;

import java.util.Scanner;

public class 바둑이승차 {

    private static int c;
    private static int n;
    private static int answer = 0;
    private boolean flag = false;

    public void DFS(int Level, int sum, int[] arr) {
        if (sum > c) {
            return;
        }
        if (Level == n) {
            answer = Math.max(answer, sum);
            return;
        }
        DFS(Level +1, sum + arr[Level], arr);
        DFS(Level + 1, sum, arr);

    }

    public static void main(String[] args) {
        final 바둑이승차 T = new 바둑이승차();
        final Scanner kb = new Scanner(System.in);

        c = kb.nextInt();
        n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
