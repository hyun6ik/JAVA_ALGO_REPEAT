package DFSBFS기초;

import java.util.*;

public class 그래프최단거리 {

    private static int n;
    private static int m;
    private static List<List<Integer>> graph;
    private static int[] checkList;
    private static int[] position;


    public void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        checkList[v] = 1;
        position[v] = 0;
        queue.add(v);

        while (!queue.isEmpty()) {
            final int len = queue.size();
            for (int i = 0; i < len; i++) {
                final Integer x = queue.poll();
                for (Integer nx : graph.get(x)) {
                    if (checkList[nx] == 0) {
                        checkList[nx] = 1;
                        queue.add(nx);
                        position[nx] = position[x] + 1;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        final 그래프최단거리 T = new 그래프최단거리();
        final Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();

        graph = new ArrayList<>();
        checkList = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        position = new int[n + 1];

        for (int i = 0; i < m; i++) {
            final int a = kb.nextInt();
            final int b = kb.nextInt();
            graph.get(a).add(b);
        }

        checkList[1] = 1;
        T.BFS(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + position[i]);
        }

    }
}
