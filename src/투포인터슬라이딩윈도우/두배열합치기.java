package 투포인터슬라이딩윈도우;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 두배열합치기 {

    public List<Integer> solution(int[] a, int[] b, int n, int m) {
        List<Integer> answer = new ArrayList<>();

        int p1 = 0;
        int p2 = 0;

        while (p1 < n && p2 < m) {
            if (a[p1] < b[p2]) {
                answer.add(a[p1++]);
            } else{
                answer.add(b[p2++]);
            }
        }

        while (p1 < n) {
            answer.add(a[p1++]);
        }

        while (p2 < m) {
            answer.add(b[p2++]);
        }

        return answer;
    }

    public static void main(String[] args) {
        final 두배열합치기 T = new 두배열합치기();
        final Scanner kb = new Scanner(System.in);

        final int n = kb.nextInt();
        final int[] a = makeArr(kb, n);
        final int m = kb.nextInt();
        final int[] b = makeArr(kb, m);

        for (Integer integer : T.solution(a, b, n, m)) {
            System.out.print(integer + " ");
        }

    }

    public static int[] makeArr(Scanner kb, int n) {
        final int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = kb.nextInt();
        }

        return arr1;
    }
}
