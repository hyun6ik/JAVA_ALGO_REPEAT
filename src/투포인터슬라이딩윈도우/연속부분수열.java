package 투포인터슬라이딩윈도우;

import java.util.Scanner;

public class 연속부분수열 {

    public Integer solution(int[] arr, int n, int m) {
        int answer = 0;
        int sum = 0;
        int p = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == m) {
                answer++;
            }
            while (sum >= m) {
                sum -= arr[p];
                p++;
                if (sum == m) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        final 연속부분수열 T = new 연속부분수열();
        final Scanner kb = new Scanner(System.in);

        final int n = kb.nextInt();
        final int m = kb.nextInt();
        final int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(arr,n,m));
    }
}
