package 정렬검색기본;

import java.util.*;

public class 장난꾸러기 {

    public List<Integer> solution(int[] arr, int n) {
        List<Integer> answer = new ArrayList<>();

        final int[] temp = arr.clone();
        Arrays.sort(temp);

        for (int i = 0; i < n; i++) {
            if (arr[i] != temp[i]) {
                answer.add(i + 1);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        final 장난꾸러기 T = new 장난꾸러기();
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
