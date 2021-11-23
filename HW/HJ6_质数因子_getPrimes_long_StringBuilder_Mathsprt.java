package HW;

import java.util.Scanner;

public class HJ6_质数因子_getPrimes_long_StringBuilder_Mathsprt {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        String result = getPrimes(num);
        System.out.println(result);
    }

    public static String getPrimes(long num) {
        StringBuilder primes = new StringBuilder();
        for (int i = 2; i <= Math.sqrt(num); i++){
            while (num % i == 0) {
                num /= i;
                primes.append(i).append(" ");
            }
        }
        return num == 1? primes.toString() : primes.toString() + num + " ";
    }
}