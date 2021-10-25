package 배열;

import java.util.Scanner;

public class 피보나치수열 {

    public int[] solution(int n) {
        final int[] arr = new int[n];

        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }

        return arr;
    }

    public static void main(String[] args) {
        final 피보나치수열 T = new 피보나치수열();
        final Scanner kb = new Scanner(System.in);

        final int n = kb.nextInt();

        for (Integer integer : T.solution(n)) {
            System.out.print(integer + " ");
        }
    }
}
