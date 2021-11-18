package BasicCode_04集合类;

/*
* 可以看出，循环ArrayList时，普通for循环比foreach循环花费的时间要少一点；
* 循环LinkList时，普通for循环比foreach循环花费的时间要多很多。
* 当我将循环次数提升到一百万次的时候，循环ArrayList，普通for循环还是比foreach要快一点；
* 但是普通for循环在循环LinkList时，程序直接卡死。
*
* 结论：需要循环数组结构的数据时，建议使用普通for循环，因为for循环采用下标访问，对于数组结构的数据来说，采用下标访问比较好。
* 需要循环链表结构的数据时，一定不要使用普通for循环，这种做法很糟糕，数据量大的时候有可能会导致系统崩溃。Add BC_04, Update Q37-38
* */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Q38_集合遍历_普通for循环_增强for循环_迭代器遍历 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        scanner.close();
        list.add(num1);
        list.add(num2);
        list.add(num3);
        list.add(num4);
        list.add(num5);
        System.out.print("普通for循环:");

        //write your code here......
        int len = list.size();
        for (int i = 0; i < len; i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
        System.out.print("增强for循环:");

        //write your code here......
        for (int i:list) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.print("迭代器遍历:");

        //write your code here......
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();
    }
}