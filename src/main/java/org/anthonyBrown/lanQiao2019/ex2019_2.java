package org.anthonyBrown.lanQiao2019;


// 数字连连看，给出一个整数数组和一个目标值，请在数组中找到三个元素，它们的和为该目标值。
// 输入说明：第一行是整数N和T，N（N<10000）表示整数数组中元素个数，T是目标值。
// 第二行是N个整数，表示数组中的元素，且每个数的绝对值小于等于100000。
// 输出说明：找到的这三个匹配元素所在位置（数组元素起始位置为1），中间用一个空格隔开，
// 若存在多个，请输出位置最小的一个（例如：数组为 8 5 4 5 3，目标值为16，位置1 2 5和1 4 5均满足条件，输出1 2 5）；
// 不满足输出-1。 输入样例：7 12 2 8 7 6 3 4 3 输出样例：1 3 5


public class ex2019_2 {
    public int[] searchForNum(int[] n, int target) {
        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                for (int k = i+j+1; k < n.length; k++) {
                    if (n[i]+n[j]+n[k] == target){
                        return new int[]{i+1,j+1,k+1};
                    }
                }
            }
        }
        return new int[]{-1};
    }
}

