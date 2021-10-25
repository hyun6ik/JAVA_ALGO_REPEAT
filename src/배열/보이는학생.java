package 배열;

import java.util.Scanner;

public class 보이는학생 {

    public Integer solution(int[] arr, int n) {
        int answer = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        final 보이는학생 T = new 보이는학생();
        final Scanner kb = new Scanner(System.in);

        final int n = kb.nextInt();
        final int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(arr, n));
    }

}
