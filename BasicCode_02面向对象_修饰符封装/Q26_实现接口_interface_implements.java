package BasicCode_02面向对象_修饰符封装;

import java.util.Scanner;

public class Q26_实现接口_interface_implements {

    public static void main(String[] args) {
        Comparator comparator = new ComparatorImpl();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(comparator.max(x, y));
        }
    }

}

interface Comparator {
    /**
     * 返回两个整数中的最大值
     */
    int max(int x, int y);
}

//write your code here......
class ComparatorImpl implements Comparator {
    @Override
    public int max(int x, int y) {
        return Math.max(x, y);
        //return x > y ? x : y;

    }
}