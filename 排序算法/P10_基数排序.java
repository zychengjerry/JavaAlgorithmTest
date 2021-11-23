package 排序算法;

/*基数排序是一种非比较型整数排序算法，其原理是将数据按位数切割成不同的数字，然后按每个位数分别比较。
假设说，我们要对 100 万个手机号码进行排序，应该选择什么排序算法呢？排的快的有归并、快排时间复杂度是 O(nlogn)，计数排序和桶排序虽然更快一些，但是手机号码位数是11位，那得需要多少桶？内存条表示不服。
这个时候，我们使用基数排序是最好的选择。
*/

import java.util.Arrays;
import java.util.LinkedList;

public class P10_基数排序 {

    public static void main(String[] args) {
        int array[]={1,1,1,3,5,6,7,9,12,0,89,13123,10};
        new P10_基数排序().radixSort(array);
        System.out.println(Arrays.toString(array));

        for(int a:array) {
            System.out.print(a + " ");
        }
    }

    void radixSort(int []array){
        //1.确定排序的趟数
        int max = findMax(array);
        int time = 0;
        while(max>0){
            max/=10;
            time++;
        }
        //2.建立10个队列
        LinkedList<Integer> queue[]=new LinkedList[10];
        for(int i=0;i<10;i++){
            queue[i]=new LinkedList<>();
        }
        //3.进行time次分配和收集
        for(int i=0;i<time;i++){
            //3.1分配数组元素
            for(int j=0;j<array.length;j++){
                //queue[array[j]%(int)Math.pow(10, i+1)/(int)Math.pow(10, i)].add(array[j]);
                queue[array[j]/(int)Math.pow(10, i)%10].add(array[j]);
            }
            //3.2收集队列元素
            int count = 0;
            for(int k=0;k<10;k++){
                while(!queue[k].isEmpty()){
                    array[count++]=queue[k].remove();
                }
            }
        }
    }

    public int findMax(int[] array) {
        int max = 0;
        for(int j=0;j<array.length;j++){
            if(array[j]>array[max]){
                max = j;
            }
        }
        return array[max];
    }

}
