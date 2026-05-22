package pers.sakuta.leetcode.challenge.domain.string.lengthOfLongestSubstring;

import java.util.Arrays;

public class Solution {

    public static int lengthOfLongestSubstring(String s) {

        int[] lastIndex = new int[128];
        Arrays.fill(lastIndex, -1);

        int left = 0;
        int maxLen = 0;

        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);

            if(lastIndex[c] >= left){
                left = lastIndex[c] + 1;
            }

            lastIndex[c] = right;

            maxLen = Math.max(maxLen, right - left + 1);

        }

        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(Solution.lengthOfLongestSubstring("abcabcbb"));
    }


}
