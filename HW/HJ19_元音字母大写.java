package HW;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class HJ19_元音字母大写 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String str_low = str.toLowerCase();

        str_low = str_low.replaceAll("a","A");
        str_low = str_low.replaceAll("e","E");
        str_low = str_low.replaceAll("i","I");
        str_low = str_low.replaceAll("o","O");
        str_low = str_low.replaceAll("u","U");

        System.out.println(str_low);

        str_low = str_low.replaceAll(" ","");
        String[] str_list = str_low.split("");

        System.out.println(Arrays.toString(str_list));
        System.out.println(str_list.length);

        String str_1 = Arrays.toString(str_list);
        char[] c = str_1.toCharArray();
        HashSet set = new HashSet();
        StringBuilder sbd = new StringBuilder();

        for (int i = 0; i < c.length; i++) {
            if (set.add(c[i])) {
                sbd.append(c[i]);
            }
        }
        System.out.println(sbd);

        sbd.delete(2,4);
        System.out.println(sbd);

    }

}
