package BasicCode;

import java.util.Scanner;

public class Q3_Round四舍五入 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d= scanner.nextDouble();

        //write your code here......
        int i = (int)Math.round(d);

        System.out.println(i);
    }
}