package HW;

import java.util.*;

public class HJ2_计算某字母出现次数 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine().toLowerCase();
        String str2 = scan.nextLine().toLowerCase();
        int number = str1.length()-str1.replaceAll(str2,"").length();
        System.out.println(number);
    }

}