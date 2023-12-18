package com.hb.demo.test_hb;

public class T012 {

    public static int solve (String s) {
        // write code here
        int n = s.length();
        if (n == 0 || s.charAt(0) == '0') {
            return 0;
        }

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            if (s.charAt(i-1) != '0') {
                dp[i] =dp[i] + dp[i-1];
            }

            String twoDigits = s.substring(i-2, i);
            if (twoDigits.compareTo("10") >= 0 && twoDigits.compareTo("26") <= 0) {
                dp[i] += dp[i-2];
            }
        }

        return dp[n];
    }

    public static void main(String[] args){
        System.out.println(solve("30717126241541717"));
    }
}
