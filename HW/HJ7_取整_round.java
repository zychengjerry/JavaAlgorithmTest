package HW;

/*写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于 0.5 ,向上取整；小于 0.5 ，则向下取整。

数据范围：保证输入的数字在 32 位浮点数范围内*/

import java.util.Scanner;

/**
 *
 * @author: JerryCheng
 * Date: 2021/11/23 15:17
 */
public class HJ7_取整_round {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d= scanner.nextDouble();
        int i = (int)Math.round(d);
        System.out.println(i);
    }
}