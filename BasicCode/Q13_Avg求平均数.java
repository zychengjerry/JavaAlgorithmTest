package BasicCode;

import java.util.Scanner;

public class Q13_Avg求平均数 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //write your code here......
        double avg;
        double sum = 0;
        int count = 0;
        while (scan.hasNext()){
            int num = scan.nextInt();
            if (num>0) {
                sum += num;
                count ++;
            } else {
                break;
            }
        }
        avg = sum/count;
        System.out.println(String.format("%.2f",avg));


        //输出格式为：System.out.println(String.format("%.2f",avg));


    }
}