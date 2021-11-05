package DFSBFS기초;

import java.util.Scanner;

public class 경로탐색DFS {

    private static int n;
    private static int m;
    private static int answer = 0;
    private static int[][] graph;
    private static int[] checkList;

    public void DFS(int v) {
        if (v == n) {
            answer++;
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (graph[v][i] == 1 && checkList[i] == 0) {
                checkList[i] = 1;
                DFS(i);
                checkList[i] = 0;
            }
        }
    }


    public static void main(String[] args) {
        final 경로탐색DFS T = new 경로탐색DFS();
        final Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();

        graph = new int[n + 1][n + 1];
        checkList = new int[n + 1];

        for (int i = 0; i < m; i++) {
            final int a = kb.nextInt();
            final int b = kb.nextInt();
            graph[a][b] = 1;
        }

        checkList[1] = 1;
        T.DFS(1);

        System.out.println(answer);
    }
}
