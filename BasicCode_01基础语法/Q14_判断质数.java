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
        int n = number /2;
        for (int i = 2; i < n; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;

    }
}