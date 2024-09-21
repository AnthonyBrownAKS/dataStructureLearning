package org.anthonyBrown.example;

public class quickSort {

    // 主函数，用于测试
    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 10, 1, 2, 1};
        System.out.println("Original array:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }

    // 快速排序的主方法
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // 获取分区索引
            int pivotIndex = partition(arr, low, high);
            // 递归排序分区
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // 分区方法，选择基准并进行分区
    private static int partition(int[] arr, int low, int high) {
        // 选择基准
        int pivot = arr[high];
        int i = (low - 1); // 最小元素的索引

        for (int j = low; j < high; j++) {
            // 如果当前元素小于等于基准
            if (arr[j] <= pivot) {
                i++;
                // 交换 arr[i] 和 arr[j]
                swap(arr, i, j);
            }
        }

        // 交换 arr[i + 1] 和 arr[high] (或基准)
        swap(arr, i + 1, high);
        return i + 1;
    }

    // 交换数组中两个元素的方法
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // 打印数组的方法
    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}