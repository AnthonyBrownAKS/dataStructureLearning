package org.anthonyBrown.testSpace;

import java.util.Random;

public class bubbleSortTest {

    // 生成一个随机数组
    public static int[] generateRandomArray(int maxValue) {
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            // 生成从1到maxValue之间的自然数
            array[i] = random.nextInt(maxValue) + 1;
        }

        return array;
    }
    public static void main(String[] args) {

        int[] array = generateRandomArray(100);
        bublle(array);
        for (int i = 0; i < array.length -1; i++) {
            System.out.println(array[i]);
        }

    }

    private static void bublle(int[] a){
        int n = a.length;
        // 判断数组是否已经有序避免浪费计算资源
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j+1]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
