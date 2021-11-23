package HW;

/*输入一个 int 型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
保证输入的整数最后一位不是 0 。

数据范围：
输入描述：
输入一个int型整数

输出描述：
按照从右向左的阅读顺序，返回一个不含重复数字的新的整数

示例1
输入：
9876673

输出：
37689*/

import java.util.*;

/**
 *
 * @author: Jerry Cheng
 * Date: 2021/11/23 16:36
 */

public class HJ9_提取不重复的整数_HashSet_add {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            HashSet<Integer> hs = new HashSet<>();
            int input = scan.nextInt();
            while (input != 0) {
                int temp = input % 10;
                if (hs.add(temp)) {
                    System.out.print(temp);
                }
                input /= 10;
            }
            System.out.println();
        }
    }
}

