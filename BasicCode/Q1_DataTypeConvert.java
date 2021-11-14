package BasicCode;

import java.util.Scanner;

public class Q1_DataTypeConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();
        System.out.println(Q1_DataTypeConvert.typeConversion(d));
    }
    public static int typeConversion(double d){

        //write your code here......
        return (int) d;

    }
}