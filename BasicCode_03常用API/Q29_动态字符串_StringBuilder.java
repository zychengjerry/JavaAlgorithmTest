package BasicCode_03常用API;

import java.util.Scanner;

public class Q29_动态字符串_StringBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        //write your code here......
        StringBuilder sb = new StringBuilder(str);
        for (int i = str.length()-3; i >= 0; i -= 3) {
            sb.insert(i, ",");
        }
        System.out.println(sb.toString());

    }
}