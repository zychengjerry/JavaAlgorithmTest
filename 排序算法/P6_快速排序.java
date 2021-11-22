package 排序算法;

/*快速排序的核心思想也是分治法，分而治之。
它的实现方式是每次从序列中选出一个基准值，其他数依次和基准值做比较，比基准值大的放右边，比基准值小的放左边，
然后再对左边和右边的两组数分别选出一个基准值，进行同样的比较移动，重复步骤，直到最后都变成单个元素，整个数组就成了有序的序列。
在区间中随机挑选一个元素作基准，将小于基准的元素放在基准之前，大于基准的元素放在基准之后，再分别对小数区与大数区进行排序。 */

import java.util.Arrays;

public class P6_快速排序 {

    public static void main(String[] args){
        int[] arr=new int[]{5,7,2,9,4,1,0,5,8,7};
        System.out.println(Arrays.toString(arr));
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // 双边扫描
    public static void quickSort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int startIndex, int endIndex) {
        if (endIndex <= startIndex) {
            return;
        }
        //切分
        int pivotIndex = partition(arr, startIndex, endIndex);
        sort(arr, startIndex, pivotIndex-1);
        sort(arr, pivotIndex+1, endIndex);
    }


    private static int partition(int[] arr, int startIndex, int endIndex) {
        int left = startIndex;
        int right = endIndex;
        int pivot = arr[startIndex];//取第一个元素为基准值

        while (true) {
            //从左往右扫描
            while (arr[left] <= pivot) {
                left++;
                if (left == right) {
                    break;
                }
            }

            //从右往左扫描
            while (pivot < arr[right]) {
                right--;
                if (left == right) {
                    break;
                }
            }

            //左右指针相遇
            if (left >= right) {
                break;
            }

            //交换左右数据
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }

        //将基准值插入序列
        int temp = arr[startIndex];
        arr[startIndex] = arr[right];
        arr[right] = temp;
        return right;
    }
}
