package org.anthonyBrown.leetCode.lengthOfLongestSubstring;

import java.util.HashSet;
import java.util.Set;

public class solution {
    public int lengthOfLongestSubstring(String s){
        Set<Character> occ = new HashSet<>();
        int n = s.length();
        // 右指针，初始-1
        int rk = -1,ans = 0;
        for (int i = 0; i < n; i++) {
            if (i != 0){
                // 左指针向右移动，移除字符
                occ.remove(s.charAt(i-1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk+1))){
                // 向右移动指针
                occ.add(s.charAt(rk+1));
                ++rk;
            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            ans = Math.max(ans,rk-i+1);
        }
        return ans;
    }
}
