package HW;

/*•连续输入字符串，请按长度为8拆分每个输入字符串并进行输出；
•长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。

输入描述：
连续输入字符串(输入多次,每个字符串长度小于等于100)

输出描述：
依次输出所有分割后的长度为8的新字符串

示例1
输入：
abc
123456789

输出：
abc00000
12345678
90000000*/

import java.util.*;

public class HJ4_字符串分隔_StringBuilder_append {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            String str = scan.nextLine();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            int size = str.length();
            int add0 = 8 - size%8;
            while ((add0 > 0) && (add0 < 8)) {
                sb.append("0");
                add0--;
            }
            String str1 = sb.toString();
            while (str1.length() > 0) {
                System.out.println(str1.substring(0,8));
                str1 = str1.substring(8);
            }
        }

    }

}
