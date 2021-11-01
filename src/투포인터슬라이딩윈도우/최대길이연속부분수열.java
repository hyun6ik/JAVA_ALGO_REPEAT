package 투포인터슬라이딩윈도우;

import java.util.Scanner;

public class 최대길이연속부분수열 {

    public Integer solution(int[] arr, int n, int k) {
        int answer = 0;
        int count = 0;
        int lt = 0;

        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) {
                count++;
            }
            while (count > k) {
                if (arr[lt] == 0) {
                    count--;
                }
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        final 최대길이연속부분수열 T = new 최대길이연속부분수열();
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
