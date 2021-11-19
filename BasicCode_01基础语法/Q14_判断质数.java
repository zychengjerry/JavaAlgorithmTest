package BasicCode_01基础语法;

import java.util.Scanner;

public class Q14_判断质数 {
    public static void main(String[] args) {
        Q14_判断质数 main = new Q14_判断质数();
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(main.isPrimeNumber(number));
    }

    public Boolean isPrimeNumber(int number) {

        //write your code here......
        // 只有两个正因数（1和自己）的自然数即为质数。比1大但不是素数的数称为合数。1和0既非素数也非合数。

//        int n = number /2;
//        for (int i = 2; i < n; i++) {
//            if (number % i == 0){
//                return false;
//            }
//        }
//        return true;
        if (number == 0 || number == 1){
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        } return true;


    }
}