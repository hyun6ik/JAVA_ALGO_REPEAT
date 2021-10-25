package 배열;

import java.util.Scanner;

public class 등수구하기 {

    public int[] solution(int[] arr, int n) {

        final int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) {
                    cnt++;
                }
            }
            answer[i] = cnt;
        }
        return answer;
    }

    public static void main(String[] args) {
        final 등수구하기 T = new 등수구하기();
        final Scanner kb = new Scanner(System.in);

        final int n = kb.nextInt();
        final int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for (Integer integer : T.solution(arr, n)) {
            System.out.print(integer + " ");
        }
    }
}
