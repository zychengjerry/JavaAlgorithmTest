package 排序算法;

/* 归并字面上的意思是合并，归并算法的核心思想是分治法，就是将一个数组一刀切两半，递归切，直到切成单个元素，然后重新组装合并，
单个元素合并成小数组，两个小数组合并成大数组，直到最终合并完成，排序完毕。
把数据分为两段，从两段中逐个选最小的元素移入新数据段的末尾。可从上到下或从下到上进行。
将一个大问题分解成无数的小问题进行处理，处理之后再合并，这里我们采用递归来实现 */

import java.util.Arrays;

public class P5_归并排序 {

    public static void main(String[] args){
        int[] arr=new int[]{5,7,2,9,4,1,0,5,8,7};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr) {
        int[] tempArr = new int[arr.length];
        sort(arr, tempArr, 0, arr.length-1);
    }
    private static void sort(int[] arr, int[] tempArr, int startIndex, int endIndex){
        if(endIndex <= startIndex){
            return;
        }
        //中部下标
        int middleIndex = startIndex + (endIndex - startIndex) / 2;

        //分解
        sort(arr, tempArr, startIndex, middleIndex);
        sort(arr, tempArr, middleIndex + 1, endIndex);

        //归并
        merge(arr, tempArr, startIndex, middleIndex, endIndex);
    }

    private static void merge(int[] arr, int[] tempArr, int startIndex, int middleIndex, int endIndex) {
        //复制要合并的数据
        for (int s = startIndex; s <= endIndex; s++) {
            tempArr[s] = arr[s];
        }

        int left = startIndex;//左边首位下标
        int right = middleIndex + 1;//右边首位下标
        for (int k = startIndex; k <= endIndex; k++) {
            if(left > middleIndex){
                //如果左边的首位下标大于中部下标，证明左边的数据已经排完了。
                arr[k] = tempArr[right++];
            } else if (right > endIndex){
                //如果右边的首位下标大于了数组长度，证明右边的数据已经排完了。
                arr[k] = tempArr[left++];
            } else if (tempArr[right] < tempArr[left]){
                arr[k] = tempArr[right++];//将右边的首位排入，然后右边的下标指针+1。
            } else {
                arr[k] = tempArr[left++];//将左边的首位排入，然后左边的下标指针+1。
            }
        }
    }

}