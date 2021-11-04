package 정렬검색기본;

import java.util.*;

class Point implements Comparable<Point>{
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) {
            return this.y - o.y;
        } else {
            return this.x - o.x;
        }
    }
}


public class 좌표정렬 {

    
    public static void main(String[] args) {
        final 좌표정렬 T = new 좌표정렬();
        final Scanner kb = new Scanner(System.in);

        final int n = kb.nextInt();

        List<Point> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            final int x = kb.nextInt();
            final int y = kb.nextInt();
            arr.add(new Point(x,y));
        }

        Collections.sort(arr);

        for (Point point : arr) {
            System.out.println(point.x + " " + point.y);
        }

    }
}
