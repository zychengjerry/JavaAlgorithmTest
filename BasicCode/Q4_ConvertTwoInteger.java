package BasicCode;

import java.util.Scanner;

public class Q4_ConvertTwoInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        //write your code here.......
        a = a + b - (b=a);

        System.out.println(a+" "+b);
    }
}