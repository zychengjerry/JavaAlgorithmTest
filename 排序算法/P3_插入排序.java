package 排序算法;

/*在乱牌中抽一张出来，插入到左边，再抽一张，插入到左边，每次插入都插入到左边合适的位置，时刻保持左边的牌是有序的，直到右边的牌抽完，则排序完毕。
在这里插入图片描述（有序区，无序区）。把无序区的第一个元素插入到有序区的合适的位置。对数组：比较得少，换得多。*/

import java.util.Arrays;

public class P3_插入排序 {

    public static void main(String[] args){
        int[] arr=new int[]{5,7,2,9,4,1,0,5,8,7};
        System.out.println(Arrays.toString(arr));
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int value = arr[i];
            int j = 0;//插入的位置
            for (j = i-1; j >= 0; j--) {
                if (arr[j] > value) {
                    arr[j+1] = arr[j];//移动数据
                } else {
                    break;
                }
            }
            arr[j+1] = value; //插入数据
        }
    }
}
