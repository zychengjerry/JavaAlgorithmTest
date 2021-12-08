package HW;

import java.util.Scanner;

/**
 *
 * @author: Jerry Cheng
 * Date: 2021/12/8 17:51
 */

public class HJ20_排列组合 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String a = in.nextLine();
            //String[] a_list = a.split("");
            char[] a_char = a.toCharArray();
            allRange(a_char, 0, a_char.length);
        }
    }

    public static void allRange(char[] ch, int start, int len) {
        if (start == len -1) {
            for (int i = 0; i < ch.length; i++) {
                System.out.print(ch[i]);
            }
            System.out.println();
        }
        for (int i = start; i < len; i++) {
            char temp = ch[start];
            ch[start] = ch[i];
            ch[i] = temp;
            allRange(ch, start + 1, len);
            temp = ch[start];
            ch[start] = ch[i];
            ch[i] = temp;
        }
    }

    /*
    void allCombine(char[] a_char, StringBuffer out, int start) {
        for (int i = start; i < a_char.length; i++) {
            out.append(a_char[i]);
            System.out.println(out);
            if (i < a_char.length -1) {
                allCombine(a_char, out, i + 1);
            }
            out.deleteCharAt(out.length() - 1);
        }
    }
    */
}