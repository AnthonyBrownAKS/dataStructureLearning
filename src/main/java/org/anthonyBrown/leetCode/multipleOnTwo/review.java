package org.anthonyBrown.leetCode.multipleOnTwo;

import java.util.HashMap;

public class review {
    public int[] twoSum(int[] a ,int target){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int e = target - a[i];
            if(hm.containsKey(e)){
                return new int[]{hm.get(e),i};// key-value!!!!
            }
            hm.put(a[i],i);
        }
        throw new IllegalArgumentException("No this number");
    }
}
