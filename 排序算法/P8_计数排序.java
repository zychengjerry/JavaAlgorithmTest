package 排序算法;

/*计数排序是一种非基于比较的排序算法，我们之前介绍的各种排序算法几乎都是基于元素之间的比较来进行排序的，
计数排序的时间复杂度为 O(n + m )，m 指的是数据量，说的简单点，计数排序算法的时间复杂度约等于 O(n)，快于任何比较型的排序算法。
在这里插入图片描述计数排序：统计小于等于该元素值的元素的个数i，于是该元素就放在目标数组的索引i位（i≥0）。
计数排序基于一个假设，待排序数列的所有数均为整数，且出现在（0，k）的区间之内。
如果 k（待排数组的最大值） 过大则会引起较大的空间复杂度，一般是用来排序 0 到 100 之间的数字的最好的算法，但是它不适合按字母顺序排序人名。
计数排序不是比较排序，排序的速度快于任何比较排序算法。
时间复杂度为 O（n+k），空间复杂度为 O（n+k）*/

import java.util.Arrays;

public class P8_计数排序 {
    public static void main(String[] args) {
        int[] array = new int[] {1,1,1,3,5,6,7,9,12,0,89,13123,10};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int a : array)  if(a > max) max = a; //find max value
        for(int a : array)  if(a < min) min = a; //find min value
        int size = max - min + 1; //the num of distinct values
        int[] count = new int[size];
        for(int i = 0; i < size; i ++) count[i] = 0; //initialize
        for(int a : array) count[a - min] ++; //counting
        for(int i = 1; i < size; i ++) count[i] += count[i - 1]; //find last index
        int[] result = new int[array.length];
        for(int i = array.length - 1; i >= 0; i --) {
            int a = array[i];
            result[count[a] - 1] = a;
            count[a]--;
        }
        System.out.println(Arrays.toString(result));
        //[0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 5, 6, 7, 8, 9]
    }
}

//class CountSort {
//
//    // 有Bug
//
//    public static void main(String[] args){
//        int[] arr=new int[]{1,1,1,3,5,6,7,9,12,0,89,13123,10};
//        System.out.println(Arrays.toString(arr));
//        countSort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    public static void countSort(int[] arr) {
//        //找出数组中的最大值
//        int max = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        //初始化计数数组
//        int[] countArr = new int[max + 1];
//
//        //计数
//        for (int i = 0; i < arr.length; i++) {
//            countArr[arr[i]]++;
//            arr[i] = 0;
//        }
//
//        //排序
//        int index = 0;
//        for (int i = 0; i < countArr.length; i++) {
//            if (countArr[i] > 0) {
//                arr[index++] = i;
//            }
//        }
//    }
//}