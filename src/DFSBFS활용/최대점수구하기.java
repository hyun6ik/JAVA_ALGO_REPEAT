package DFSBFS활용;

import java.util.Scanner;

public class 최대점수구하기 {

    private static int n;
    private static int m;
    private static int answer = 0;
    private static int sum = 0;
    private static int time = 0;
    private static int[] times;
    private static int[] scores;


    public void DFS(int Level, int sum, int time, int[] scores, int[] times) {
        if (time > m) {
            return;
        }
        if (Level == n) {
            answer = Math.max(answer, sum);
            return;
        }
        DFS(Level + 1, sum + scores[Level], time + times[Level], scores, times);
        DFS(Level + 1, sum, time, scores, times);
    }

    public static void main(String[] args) {
        final 최대점수구하기 T = new 최대점수구하기();
        final Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();

        times = new int[n];
        scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = kb.nextInt();
            times[i] = kb.nextInt();
        }

        T.DFS(0, 0, 0, scores, times);
        System.out.println(answer);

    }
}
