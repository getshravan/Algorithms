package com.shravan.sort;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args) {
        LongestSubstring longestSubstring = new LongestSubstring();
        System.out.println(longestSubstring.lengthOfLongestSubstring("pwwkew"));
        System.out.println(longestSubstring.lengthOfLongestSubstring("bbbbb"));
        System.out.println(longestSubstring.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(longestSubstring.lengthOfLongestSubstring("ckilbkdmzsreyiki"));
        System.out.println(longestSubstring.lengthOfLongestSubstring("ckilbkd"));
        //require Math.max on i calculation logic
        System.out.println(longestSubstring.lengthOfLongestSubstring("abba"));
    }

    private int lengthOfLongestSubstring(String inputString) {
        Map<Character, Integer> tempMap = new HashMap<>();
        // Keep track of index positions of repeating characters
        int i = 0;
        // If a repetitive character found at index 2 in hash, then delay incrementing
        // the ans for next 2 positions
        int ans = 0;
        for (int j = 0; j < inputString.length(); j++) {
            if (tempMap.containsKey(inputString.charAt(j))) {
                // In case of "abba" at index 2 (starting from 0), i will be 2
                // but at index 3, the below condition prevents i from getting re-assigned
                // to lower number(i.e 1) than the current number
                i = Math.max(i, tempMap.get(inputString.charAt(j)));
            }

            ans = Math.max(ans, j - i+1);
            tempMap.put(inputString.charAt(j), j + 1);


        }
        return ans;
    }
}
