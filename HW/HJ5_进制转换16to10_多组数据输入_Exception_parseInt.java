package HW;

import java.util.Scanner;

/*接受一个十六进制的数，输出该数值的十进制表示。
数据范围：保证结果在 1 <= n <= 2^31 -1
注意本题有多组输入*/

public class HJ5_进制转换16to10_多组数据输入_Exception_parseInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String str = scan.nextLine();
            int num = Integer.parseInt(str.substring(2,str.length()),16);
            System.out.println(num);
        }
    }
}
