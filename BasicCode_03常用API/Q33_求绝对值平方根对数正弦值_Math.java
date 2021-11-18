package BasicCode_03常用API;

import java.util.Scanner;

public class Q33_求绝对值平方根对数正弦值_Math {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double num = scanner.nextDouble();

        //write your code here......
        System.out.println(Math.abs(num));
        System.out.println(Math.sqrt(num));
        System.out.println(Math.log(num));
        System.out.println(Math.sin(num));


    }
}