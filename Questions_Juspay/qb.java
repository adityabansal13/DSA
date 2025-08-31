package Questions_Juspay;

import java.util.*;

public class qb {
    static Map<String, Long> fee = new HashMap<>();

    // Helper to create unique key for an edge
    static String edgeKey(int u, int v) {
        return (u < v) ? u + "_" + v : v + "_" + u;
    }

    // Update fees along path a -> b
    static void addFee(int a, int b, int x) {
        while (a != b) {
            if (a > b) {
                String key = edgeKey(a, a / 2);
                fee.put(key, fee.getOrDefault(key, 0L) + x);
                a /= 2;
            } else {
                String key = edgeKey(b, b / 2);
                fee.put(key, fee.getOrDefault(key, 0L) + x);
                b /= 2;
            }
        }
    }

    // Query fees along path a -> b
    static long queryFee(int a, int b) {
        long total = 0;
        while (a != b) {
            if (a > b) {
                String key = edgeKey(a, a / 2);
                total += fee.getOrDefault(key, 0L);
                a /= 2;
            } else {
                String key = edgeKey(b, b / 2);
                total += fee.getOrDefault(key, 0L);
                b /= 2;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        while (q-- > 0) {
            int type = sc.nextInt();
            if (type == 1) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int x = sc.nextInt();
                addFee(a, b, x);
            } else {
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(queryFee(a, b));
            }
        }
        sc.close();
    }
}
