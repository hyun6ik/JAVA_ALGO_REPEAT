package 투포인터슬라이딩윈도우;

import java.util.Scanner;

public class 연속된자연수의합 {

    public Integer solution(int n) {
        int answer = 0;
        int sum = 0;
        int lt = 0;
        int m = n / 2 + 1;

        final int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = i + 1;
        }

        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if (sum == n) {
                answer++;
            }
            while (sum >= n) {
                sum -= arr[lt];
                lt++;
                if (sum == n) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        final 연속된자연수의합 T = new 연속된자연수의합();
        final Scanner kb = new Scanner(System.in);

        final int n = kb.nextInt();

        System.out.println(T.solution(n));
    }
}
