package BasicCode_01基础语法;

import java.util.Scanner;

public class Q2_SimpleCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        //write your code here......
        if (a<b){
            int c = a;
            a = b;
            b = c;
        }
        System.out.print((a+b)+" "+(a-b)+" "+(a*b)+" "+(a/b)+" "+(a%b));

    }
}