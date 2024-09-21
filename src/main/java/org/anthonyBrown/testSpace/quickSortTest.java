package org.anthonyBrown.testSpace;

public class quickSortTest {

    // app类——快速排序的时间复杂度:
    // 在平均情况下为O(n log n)
    // 在最坏情况下为O(n^2)
    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 10, 1, 2, 1};
        System.out.println("Original array:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArray(arr);





    }


    public static void quickSort(int[] arr,int low ,int high){
        if(low < high){
            // 获取基准的索引(基准可以随机选择、选择第一个元素、选择最后一个元素、或选择中间元素)
            // 所有前列元素皆小于中间元素
            // 所有后列元素皆大于中间元素
            int pivotIndex = partition(arr,low,high);




        }
    }


    // 获取分区基准
    public static int partition(int[] arr,int low,int high){
        // 选择中间元素
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            // 如果元素小于基准
            if (arr[j] < pivot){
                i++;
                swap(arr,i,j);
            }
        }

        // 交换arr[i+1和arr[high]]
        swap(arr,i+1,high);
        return i+1;
    }



    // 交换方法
    public static void swap(int[] arr,int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[i] = temp;
    }

    // 打印数组的方法
    private static void printArray(int[] arr){
        for (int i : arr
             ) {
            System.out.println(i+" ");
        }
        System.out.println();

    }









}
