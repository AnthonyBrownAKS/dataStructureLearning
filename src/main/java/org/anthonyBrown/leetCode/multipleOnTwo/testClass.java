package org.anthonyBrown.leetCode.multipleOnTwo;

import org.anthonyBrown.leetCode.multipleOnTwo.multipleOnTwo;

public class testClass {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;


        review mot = new review();
        int[] a = mot.twoSum(nums,target);

        System.out.println(a[0]+"+"+a[1]);

    }
}
