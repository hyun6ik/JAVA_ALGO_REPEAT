package 배열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 가위바위보 {

    private static final String A_WIN = "A";
    private static final String B_WIN = "B";
    private static final String DRAW = "D";

    public List<String> solution(int[] arr1, int[] arr2, int n) {
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr1[i] == 1 && arr2[i] == 3) {
                answer.add(A_WIN);
            } else if (arr1[i] == 2 && arr2[i] == 1) {
                answer.add(A_WIN);
            } else if (arr1[i] == 3 && arr2[i] == 2) {
                answer.add(A_WIN);
            } else if (arr1[i] == arr2[i]) {
                answer.add(DRAW);
            } else {
                answer.add(B_WIN);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        final 가위바위보 T = new 가위바위보();
        final Scanner kb = new Scanner(System.in);

        final int n = kb.nextInt();
        final int[] arr1 = new int[n];
        final int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = kb.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = kb.nextInt();
        }

        for (String s : T.solution(arr1, arr2, n)) {
            System.out.println(s);
        }
    }
}
