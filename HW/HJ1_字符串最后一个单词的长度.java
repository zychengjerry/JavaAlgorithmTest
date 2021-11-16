package HW;

import java.util.Scanner;

public class HJ1_字符串最后一个单词的长度 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] s = str.split(" ");
        int length = s[s.length - 1].length();
        System.out.println(length);
    }

}