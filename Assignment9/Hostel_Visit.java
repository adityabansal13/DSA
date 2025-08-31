package Assignment9;

import java.util.*;

public class Hostel_Visit {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int k = sc.nextInt();

        // Max heap (store farthest among k nearest at top)
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());

        while (q-- > 0) {
            int type = sc.nextInt();

            if (type == 1) {
                long x = sc.nextLong();
                long y = sc.nextLong();
                long dis = x * x + y * y;

                if (pq.size() < k) {
                    pq.add(dis);
                } else if (dis < pq.peek()) {
                    pq.poll();
                    pq.add(dis);
                }
            } else if (type == 2) {
                System.out.println(pq.peek());
            }
        }
        sc.close();
    }

}
