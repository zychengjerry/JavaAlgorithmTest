package BasicCode_01基础语法;

import java.util.Scanner;
import java.util.Arrays;

public class Q16_找出数组中的最大最小值 {
    public static void main(String[] args) {
        int[] ary = new int[6];
        int max;
        int min;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <ary.length ; i++) {
            ary[i]=scanner.nextInt();
        }

        //write your code here......
        Arrays.sort(ary);
        max = ary[5];
        min = ary[0];

        System.out.println(max+" "+min);
    }
}