package com.hb.demo.test_hb;

public class T011 {
    public static String LCS(String str1, String str2) {
        // write code here
        int len1 = str1.length();
        int len2 = str2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];
        int maxLength = 0;
        int endIndex = 0;
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j]>maxLength) {
                        maxLength = dp[i][j];
                        endIndex = i;
                    }
                }
                else {
                    dp[i][j] = 0;
                }
            }
        }
        if(maxLength == 0){
            return null;
        }
        return str1.substring(endIndex-maxLength,endIndex);
    }

    public static void main(String[] args) {
        System.out.println(LCS("1AB2345CD", "12345EF"));
    }
}
