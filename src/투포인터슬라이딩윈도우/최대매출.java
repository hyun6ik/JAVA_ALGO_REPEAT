package 투포인터슬라이딩윈도우;

import java.util.Scanner;

public class 최대매출 {

    public Integer solution(int[] arr, int n, int k) {
        int answer = 0;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        answer = sum;

        for (int i = k; i < n; i++) {
            sum += (arr[i] - arr[i - k]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }

    public static void main(String[] args) {
        final 최대매출 T = new 최대매출();
        final Scanner kb = new Scanner(System.in);

        final int n = kb.nextInt();
        final int k = kb.nextInt();

        final int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(arr,n,k));
    }
}
