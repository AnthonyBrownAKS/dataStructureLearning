package org.anthonyBrown.example;

public class bubbleSort {
    public class BubbleSort {

        // 冒泡排序实现
        public static void bubbleSort(int[] array) {
            int n = array.length;
            boolean swapped;
            for (int i = 0; i < n - 1; i++) {
                swapped = false;
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        // 交换 array[j] 和 array[j + 1]
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        swapped = true;
                    }
                }
                // 如果没有交换，数组已经有序
                if (!swapped) break;
            }
        }

        public static void main(String[] args) {
            int[] array = {64, 34, 25, 12, 22, 11, 90};
            System.out.println("排序前:");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();

            bubbleSort(array);

            System.out.println("排序后:");
            for (int num : array) {
                System.out.print(num + " ");
            }
        }
    }

}
