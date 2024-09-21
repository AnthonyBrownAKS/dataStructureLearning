package org.anthonyBrown.leetCode.lengthOfLongestSubstring;

import java.util.HashSet;
import java.util.Set;

public class solution2 {
    public int lengthOfLongestSubString(String s) {
        Set<Character> nums = new HashSet<>();
        int rk = -1,ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i != 0){
                nums.remove(s.charAt(i-1));
            }
            while (rk + 1 < s.length() && !nums.contains(s.charAt(rk+1))){
                nums.add(s.charAt(rk+1));
                ++rk;
            }
            ans = Math.max(ans,rk - i +1);
        }
        return ans;
    }
}
