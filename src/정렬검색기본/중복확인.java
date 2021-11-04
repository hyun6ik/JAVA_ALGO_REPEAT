package 정렬검색기본;

import java.util.Scanner;

public class 중복확인 {

    private static final String Duplicate = "D";
    private static final String Unique = "U";

    public String solution(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] == arr[i]) {
                    return Duplicate;
                }
            }
        }
        return Unique;
    }

    public static void main(String[] args) {
        final 중복확인 T = new 중복확인();
        final Scanner kb = new Scanner(System.in);

        final int n = kb.nextInt();
        final int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(arr,n));
    }
}
