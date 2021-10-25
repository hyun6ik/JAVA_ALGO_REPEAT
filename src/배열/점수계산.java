package 배열;

import java.util.Scanner;

public class 점수계산 {

    public int solution(int[] arr, int n) {
        int answer = 0;
        int p = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                p++;
                answer += p;
            } else {
                p = 0;
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        final 점수계산 T = new 점수계산();
        final Scanner kb = new Scanner(System.in);

        final int n = kb.nextInt();
        final int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(arr, n));
    }
}
