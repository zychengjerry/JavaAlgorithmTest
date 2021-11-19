package BasicCode_05综合练习;

import java.util.Scanner;

public class Q48_判断素数个数_for_if_isPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        method(start,end);
    }

    public static boolean isPrime(int number) {
        if (number == 0 || number == 1){    //只有两个正因数（1和自己）的自然数即为质数。比1大但不是素数的数称为合数。1和0既非素数也非合数。
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        } return true;
    }

    public static void method(int start, int end) {
        int count=0;

        //write your code here......
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        for (int i = start; i <= end; i++) {
            if (i <= 2) {
                continue;
            }
            if (isPrime(i)) {
                count++;
            }
        }

        System.out.println(start+"到"+end+"之间有"+count+"个大于2的素数");
    }
}