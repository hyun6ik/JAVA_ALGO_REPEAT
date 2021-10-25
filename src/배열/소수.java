package 배열;

import java.util.Scanner;

public class 소수 {

    public Integer solution(int n) {
        int answer = 0;
        final int[] arr = new int[n+1];

        for (int i = 2; i <= n; i++) {
            if (arr[i] == 0) {
                answer++;
                for (int j = i; j <= n; j=j+i) {
                    arr[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        final 소수 T = new 소수();
        final Scanner kb = new Scanner(System.in);

        final int n = kb.nextInt();

        System.out.println(T.solution(n));
    }
}
