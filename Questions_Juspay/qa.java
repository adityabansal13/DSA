package Questions_Juspay;

import java.io.*;
import java.util.*;

public class qa {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        long[] cost = new long[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            cost[i] = Long.parseLong(st.nextToken());
        }

        String[] s = new String[n];
        String[] rev = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = br.readLine();
            rev[i] = new StringBuilder(s[i]).reverse().toString();
        }

        long INF = Long.MAX_VALUE / 2;
        long[][] dp = new long[n][2];

        // Base case
        dp[0][0] = 0;           // no reverse
        dp[0][1] = cost[0];     // reversed

        for (int i = 1; i < n; i++) {
            dp[i][0] = INF;
            dp[i][1] = INF;

            // Case 1: i-th string not reversed
            if (s[i].compareTo(s[i - 1]) >= 0)
                dp[i][0] = Math.min(dp[i][0], dp[i - 1][0]);
            if (s[i].compareTo(rev[i - 1]) >= 0)
                dp[i][0] = Math.min(dp[i][0], dp[i - 1][1]);

            // Case 2: i-th string reversed
            if (rev[i].compareTo(s[i - 1]) >= 0)
                dp[i][1] = Math.min(dp[i][1], dp[i - 1][0] + cost[i]);
            if (rev[i].compareTo(rev[i - 1]) >= 0)
                dp[i][1] = Math.min(dp[i][1], dp[i - 1][1] + cost[i]);
        }

        long ans = Math.min(dp[n - 1][0], dp[n - 1][1]);
        System.out.println(ans >= INF ? -1 : ans);
    }
}
