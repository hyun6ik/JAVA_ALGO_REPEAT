package 정렬검색기본;

import java.util.Scanner;

public class 삽입정렬 {

    public int[] solution(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > temp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        final 삽입정렬 T = new 삽입정렬();
        final Scanner kb = new Scanner(System.in);

        final int n = kb.nextInt();
        final int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for (Integer i : T.solution(arr, n)) {
            System.out.print(i + " ");
        }
    }
}
