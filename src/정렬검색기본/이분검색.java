package 정렬검색기본;

import java.util.Arrays;
import java.util.Scanner;

public class 이분검색 {

    public Integer solution(int[] arr, int n, int m) {
        int answer =0;
        int mid;
        int left = 0;
        int right = arr.length - 1;

        Arrays.sort(arr);

        while (right >= left) {
            mid = (right + left) / 2;
            if (m == arr[mid]) {
               answer = mid + 1;
               break;
            } else if (m > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        final 이분검색 T = new 이분검색();
        final Scanner kb = new Scanner(System.in);

        final int n = kb.nextInt();
        final int m = kb.nextInt();

        final int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(arr, n, m));
    }
}
