package 해쉬맵트리;

import java.util.*;

public class 매출액종류 {

    public List<Integer> solution(int[] arr, int n, int k) {
        List<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k-1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int lt = 0;
        for (int rt = k - 1; rt < n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            answer.add(map.size());
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if (map.get(arr[lt]) == 0) {
                map.remove(arr[lt]);
            }
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        final 매출액종류 T = new 매출액종류();
        final Scanner kb = new Scanner(System.in);

        final int n = kb.nextInt();
        final int k = kb.nextInt();

        final int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for (Integer integer : T.solution(arr, n, k)) {
            System.out.print(integer + " ");
        }
    }
}
