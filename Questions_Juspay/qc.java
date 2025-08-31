package Questions_Juspay;

import java.util.*;

public class qc {
    public static int minMoves(int[] seats) {
        Arrays.sort(seats);
        int n = seats.length;
        int maxFit = 0;
        int j = 0;

        // Sliding window
        for (int i = 0; i < n; i++) {
            while (j < n && seats[j] - seats[i] < n) {
                j++;
            }
            maxFit = Math.max(maxFit, j - i);
        }
        return n - maxFit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] seats = new int[n];
        for (int i = 0; i < n; i++) {
            seats[i] = sc.nextInt();
        }
        System.out.println(minMoves(seats));
        sc.close();
    }
}
