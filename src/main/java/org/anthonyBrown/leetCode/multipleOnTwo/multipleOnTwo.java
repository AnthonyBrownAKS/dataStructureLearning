package org.anthonyBrown.leetCode.multipleOnTwo;

import java.util.HashMap;

public class multipleOnTwo {
    //给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标
    //你可以假设每种输入只会对应一个答案，并且你不能使用两次相同的元素。
    //你可以按任意顺序返回答案。
    public int[] twoSum(int[] nums,int target){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int dv = target - nums[i];
            if (hm.containsKey(dv)){
                return new int[]{hm.get(dv),i};
            }
            hm.put(nums[i],i);
        }
        // 如果没有找到符合条件的两个数，抛出异常
        throw new IllegalArgumentException("No two sum solution");
    }
}
