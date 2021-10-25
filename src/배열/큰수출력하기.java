package 배열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 큰수출력하기 {

    public List<Integer> solution(int[] arr, int n) {
        List<Integer> answer = new ArrayList<>();

        answer.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                answer.add(arr[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        final 큰수출력하기 T = new 큰수출력하기();
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
