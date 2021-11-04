package 정렬검색기본;

import java.util.Scanner;

public class 선택정렬 {

    public int[] solution(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int idx = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[idx]) {
                    idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        final 선택정렬 T = new 선택정렬();
        final Scanner kb = new Scanner(System.in);

        final int n = kb.nextInt();
        final int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for (int i : T.solution(arr, n)) {
            System.out.print(i + " ");
        }
    }
}
