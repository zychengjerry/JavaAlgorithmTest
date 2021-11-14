package BasicCode;

import java.util.Scanner;

public class Q12_小球走过路程计算 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float h=scanner.nextFloat();
        int n =scanner.nextInt();

        //write your code here......
        int i = 0;
        double result = h;
        double sum = h;
        for (i = n; i > 0; i--) {
            result /= 2;
            if (i > 1){
                sum += result * 2;
            }
        }

        //输出格式为：System.out.println(String.format("%.3f", h)+" "+String.format("%.3f", sum));
        System.out.println(String.format("%.3f", result)+" "+String.format("%.3f", sum));

    }
}