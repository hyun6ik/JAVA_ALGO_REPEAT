package 스택큐;

import java.util.Scanner;
import java.util.Stack;

public class 크레인인형뽑기 {

    public Integer solution(int[][] board, int n, int[] moves, int m) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int move : moves) {
            for (int i = 0; i < n; i++) {
                if (board[i][move-1] != 0) {
                    int temp = board[i][move - 1];
                    board[i][move-1] = 0;
                    if (!stack.isEmpty() && temp == stack.peek()) {
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.push(temp);
                    }
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        final 크레인인형뽑기 T = new 크레인인형뽑기();
        final Scanner kb = new Scanner(System.in);

        final int n = kb.nextInt();
        final int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = kb.nextInt();
            }
        }

        final int m = kb.nextInt();
        final int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = kb.nextInt();
        }

        System.out.println(T.solution(board,n,moves,m));

    }


}
