package DFSBFS기초;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 송아지찾기 {


    public int BFS(int s, int e) {
        int[] position = {1, -1, 5};
        int[] checkList = new int[10001];
        Queue<Integer> queue = new LinkedList<>();

        int Level = 0;
        checkList[s] = 1;
        queue.add(s);

        while (!queue.isEmpty()) {
            final int len = queue.size();
            for (int i = 0; i < len; i++) {
                final Integer x = queue.poll();
                if (x == e) {
                    return Level;
                }
                for (int p : position) {
                    final int nx = x + p;
                    if (nx >= 1 && nx <= 10000 && checkList[nx] == 0) {
                        checkList[nx] = 1;
                        queue.add(nx);
                    }
                }
            }
            Level++;
        }
        return 0;
    }

    public static void main(String[] args) {
        final 송아지찾기 T = new 송아지찾기();
        final Scanner kb = new Scanner(System.in);

        final int s = kb.nextInt();
        final int e = kb.nextInt();

        System.out.println(T.BFS(s, e));
    }
}
