package HW;
/*输入一个 int 型的正整数，计算出该 int 型数据在内存中存储时 1 的个数。

数据范围：保证在 32 位整型数字范围内
输入描述：
 输入一个整数（int类型）

输出描述：
 这个数转换成2进制后，输出1的个数

示例1
输入：
5

输出：
2*/
import java.util.*;

/**
 *
 * @author: Jerry Cheng
 * Date: 2021/11/24 10:53
 */

public class HJ15_求int型正整数在内存中存储时1的个数_10to2_toBinaryString_charAt {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String str = Integer.toBinaryString(num);
        System.out.println(check(str));
    }

    public static int check(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {             //注意char 单引号！！！！！！！！！'1'
                count ++;
            }
        }
        return count;
    }
}