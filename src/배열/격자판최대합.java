package 배열;

import java.util.Scanner;

public class 격자판최대합 {

    public Integer solution(int[][] arr, int n) {

        int rowColMax = Integer.MIN_VALUE;
        int crossMax1 = Integer.MIN_VALUE;
        int crossMax2 = Integer.MIN_VALUE;

        // 가로 세로 합 구하기
        for (int i = 0; i < n; i++) {
            int result1 = 0;
            int result2 = 0;
            for (int j = 0; j < n; j++) {
                result1 += arr[i][j];
                result2 += arr[j][i];
            }
            if (result1 > rowColMax) {
                rowColMax = result1;
            }
            if (result2 > rowColMax) {
                rowColMax = result1;
            }
        }
        // 양 대각선 합 구하기
        for (int i = 0; i < n; i++) {
            crossMax1 += arr[i][i];
        }

        for (int i = 0; i < n; i++) {
            crossMax2 += arr[i][n - 1 - i];
        }

        final int r2 = Math.max(crossMax1, crossMax2);

        return Math.max(rowColMax, r2);
    }

    public static void main(String[] args) {
        final 격자판최대합 T = new 격자판최대합();
        final Scanner kb = new Scanner(System.in);

        final int n = kb.nextInt();
        final int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        System.out.println(T.solution(arr,n));
    }
}
