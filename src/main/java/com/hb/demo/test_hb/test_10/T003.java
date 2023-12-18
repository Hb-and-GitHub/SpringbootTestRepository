package com.hb.demo.test_hb.test_10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class T003 {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String b = "abc";
        System.out.println(new T003().findAnagrams(s, b));

    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        // 创建辅助数组用于记录字符串p中每个字符的出现次数
        int[] pCount = new int[26];
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int left = 0; // 滑动窗口的左边界
        int right = 0; // 滑动窗口的右边界
        int count = p.length(); // 记录当前窗口中与字符串p为异位词的字符数量

        while (right < s.length()) {
            // 如果当前字符在辅助数组中的计数大于0，说明它是字符串p中的字符之一
            if (pCount[s.charAt(right) - 'a'] > 0) {
                count--; // 将count减1
            }
            pCount[s.charAt(right) - 'a']--; // 更新辅助数组中当前字符的计数
            right++; // 右边界向右移动

            // 当窗口大小等于字符串p的长度时，判断窗口中的字符是否与字符串p为异位词
            if (right - left == p.length()) {
                if (count == 0) {
                    result.add(left); // 将左边界加入结果列表
                }

                // 如果左边界所指向的字符在辅助数组中计数大于等于0，说明它是字符串p中的字符之一
                if (pCount[s.charAt(left) - 'a'] >= 0) {
                    count++; // 将count加1
                }
                pCount[s.charAt(left) - 'a']++; // 更新辅助数组中左边界字符的计数
                left++; // 左边界向右移动
            }
        }

        return result;
    }

}
