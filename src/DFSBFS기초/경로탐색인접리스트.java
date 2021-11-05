package DFSBFS기초;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 경로탐색인접리스트 {

    private static int n;
    private static int m;
    private static int answer = 0;
    private static List<List<Integer>> graph;
    private static int[] checkList;

    public void DFS(int v) {
        if (v == n) {
            answer++;
            return;
        }
        for (Integer nv : graph.get(v)) {
            if (checkList[nv] == 0) {
                checkList[nv] = 1;
                DFS(nv);
                checkList[nv] = 0;
            }
        }

    }

    public static void main(String[] args) {
        final 경로탐색인접리스트 T = new 경로탐색인접리스트();
        final Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();

        graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        checkList = new int[n + 1];

        for (int i = 0; i < m; i++) {
            final int a = kb.nextInt();
            final int b = kb.nextInt();
            graph.get(a).add(b);
        }

        checkList[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }
}
