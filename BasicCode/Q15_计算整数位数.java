package BasicCode;

import java.util.Scanner;

public class Q15_计算整数位数 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        //write code here......
        if (num <= 0){
            System.out.println(num);
        }
        int count =0;
        while (num > 0){
            count++;
            num /= 10;
        }
        System.out.println(count);

    }
}
