package HW;
/*给定 n 个字符串，请对 n 个字符串按照字典序排列。

输入描述：
输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
输出描述：
数据输出n行，输出结果为按照字典序排列的字符串。
示例1
输入：
9
cap
to
cat
card
two
too
up
boat
boot

输出：
boat
boot
cap
card
cat
to
too
two
up*/
import java.util.*;

/**
 *
 * @author: Jerry Cheng
 * Date: 2021/11/24 10:24
 */

public class HJ14_字符串排序_StringList_Arrays_sort{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        String[] strl = new String[num];
        for (int i = 0; i <= num-1; i++){
            strl[i] = scan.nextLine();
        }
        Arrays.sort(strl);
        for (String str:strl) {
            System.out.println(str);
        }
    }
}