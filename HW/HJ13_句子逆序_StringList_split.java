package HW;

/*将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符

注意本题有多组输入
输入描述：
输入一个英文语句，每个单词用空格隔开。保证输入只包含空格和字母。

输出描述：
得到逆序的句子

示例1
输入：
I am a boy

输出：
boy a am I*/

import java.util.*;

/**
 *
 * @author: Jerry Cheng
 * Date: 2021/11/23 17:20
 */

public class HJ13_句子逆序_StringList_split{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] strl = str.split(" ");
        for (int i = strl.length-1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(strl[i] + " ");
            }else {
                System.out.print(strl[i]);
            }
        }
    }
}