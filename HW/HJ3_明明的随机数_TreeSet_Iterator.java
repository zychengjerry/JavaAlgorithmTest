package HW;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Arrays;
import java.util.TreeSet;

/*存在bug，在处理多组示例时只能处理第一组示例。*/

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