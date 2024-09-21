package org.anthonyBrown.leetCode.findMedianSortedArrays;

import java.util.ArrayList;
import java.util.Collections;

public class solution {
    public double findMedianSortedArrays(int[] nums1,int[] nums2){
        float middle_num = 0;
        ArrayList<Integer> al = new ArrayList<>();
        for (int a :
                nums1) {
            al.add(a);
        }

        for (int b :
                nums2) {
            al.add(b);
        }
        Collections.sort(al);
        if (al.size() % 2 == 1){
            middle_num = al.get(al.size()/2);
        }else {
            middle_num = (float) (al.get(al.size() / 2 - 1) + al.get(al.size() / 2)) /2;
        }
        return middle_num;
    }
}
