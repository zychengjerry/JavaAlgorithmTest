package 排序算法;

/*堆排序顾名思义，是利用堆这种数据结构来进行排序的算法。
堆是一种优先队列，两种实现，最大堆和最小堆，由于我们这里排序按升序排，所以就直接以最大堆来说吧。
我们完全可以把堆（以下全都默认为最大堆）看成一棵完全二叉树，但是位于堆顶的元素总是整棵树的最大值，每个子节点的值都比父节点小，
由于堆要时刻保持这样的规则特性，所以一旦堆里面的数据发生变化，我们必须对堆重新进行一次构建。*/

import java.util.Arrays;

public class P7_堆排序 {

    public static void main(String[] args){
        int[] arr=new int[]{5,7,2,9,4,1,0,5,8,7};
        System.out.println(Arrays.toString(arr));
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void heapSort(int[] arr) {
        int length = arr.length;
        //构建堆
        buildHeap(arr, length);
        for ( int i = length - 1; i > 0; i-- ) {
            //将堆顶元素与末位元素调换
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            //数组长度-1 隐藏堆尾元素
            length--;
            //将堆顶元素下沉 目的是将最大的元素浮到堆顶来
            sink(arr, 0, length);
        }
    }
    private static void buildHeap(int[] arr, int length) {
        for (int i = length / 2; i >= 0; i--) {
            sink(arr, i, length);
        }
    }

    private static void sink(int[] arr, int index, int length) {
        int leftChild = 2 * index + 1;//左子节点下标
        int rightChild = 2 * index + 2;//右子节点下标
        int present = index;//要调整的节点下标

        //下沉左边
        if (leftChild < length && arr[leftChild] > arr[present]) {
            present = leftChild;
        }

        //下沉右边
        if (rightChild < length && arr[rightChild] > arr[present]) {
            present = rightChild;
        }

        //如果下标不相等 证明调换过了
        if (present != index) {
            //交换值
            int temp = arr[index];
            arr[index] = arr[present];
            arr[present] = temp;

            //继续下沉
            sink(arr, present, length);
        }
    }
}
