package HW;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Arrays;
import java.util.TreeSet;

/*存在bug，在处理多组示例时只能处理第一组示例。
* 输入描述：
        注意：输入可能有多组数据(用于不同的调查)。每组数据都包括多行，第一行先输入随机整数的个数 N ，接下来的 N 行再输入相应个数的整数。具体格式请看下面的"示例"。

        输出描述：
        返回多行，处理后的结果

        示例
        输入：
        3
        2
        2
        1
        11
        10
        20
        40
        32
        67
        40
        20
        89
        300
        400
        15

        输出：
        1
        2
        10
        15
        20
        32
        40
        67
        89
        300
        400*/

public class HJ3_明明的随机数_TreeSet_Iterator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //获取个数
        int num = sc.nextInt();
        //创建TreeSet进行去重排序
        TreeSet set = new TreeSet();
        //输入
        for(int i =0 ; i < num ;i++){
            set.add(sc.nextInt());
        }

        //输出
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}