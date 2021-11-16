package BasicCode;

import java.util.Arrays;
import java.util.Scanner;

public class Q17_数组倒转 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        //write your code here......
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println(Arrays.toString(arr));
    }
}