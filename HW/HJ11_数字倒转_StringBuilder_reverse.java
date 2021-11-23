package HW;
/*输入一个整数，将这个整数以字符串的形式逆序输出
程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001

输入描述：
输入一个int整数

输出描述：
将这个整数以字符串的形式逆序输出

示例1
输入：
1516000

输出：
0006151

示例2
输入：
0

输出：
0*/

import java.util.*;

/**
 *
 * @author: Jerry Cheng
 * Date: 2021/11/23 17:04
 */

public class HJ11_数字倒转_StringBuilder_reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        StringBuilder strb = new StringBuilder(str);
        strb.reverse();
        System.out.println(strb.toString());
    }
}