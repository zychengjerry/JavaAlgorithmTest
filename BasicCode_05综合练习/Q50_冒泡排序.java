package BasicCode_05综合练习;

import java.util.Arrays;
import java.util.Scanner;

public class Q50_冒泡排序 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        //write your code here......
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }
    }
}