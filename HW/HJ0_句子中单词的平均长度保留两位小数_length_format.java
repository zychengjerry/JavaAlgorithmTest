package HW;

import java.util.Scanner;

/**
 *
 * @author: Jerry Cheng
 * Date: 2021/12/1 11:36
 */

public class HJ0_句子中单词的平均长度保留两位小数_length_format {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] words = str.split(" ");
        double sum = 0;
        double avg = 0;

        for (int i = 0; i < words.length; i++) {
            sum += words[i].length();
        }

        avg = sum/words.length;
        //System.out.println(avg);
        System.out.println(String.format("%.2f",avg).toString());   //保留两位小数
    }
}
