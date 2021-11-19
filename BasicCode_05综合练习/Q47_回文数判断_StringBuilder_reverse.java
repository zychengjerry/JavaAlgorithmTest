package BasicCode_05综合练习;

import java.util.Scanner;

public class Q47_回文数判断_StringBuilder_reverse {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Q47_回文数判断_StringBuilder_reverse main = new Q47_回文数判断_StringBuilder_reverse();
        int number = console.nextInt();
        System.out.println(main.palindromeNumber(number));
    }

    public Boolean palindromeNumber(int number) {

        //write your code here......
//        方法一:
        StringBuilder sb = new StringBuilder(number + "").reverse();    //tringBuilder(number + "")
        return sb.toString().equals(number + "");
//        if (sb.toString().equals(number + "")) {
//            return true;
//        }else return false;

//        方法二:
//        int arr[] = new int[5];// 创建一个大小为5的数组
//        int i = 0;
//        do {// 逐次取位
//            arr[i] = number % 10;
//            number /= 10;
//            i++;
//        } while (i < 5);
//        if (arr[0] == arr[4] && arr[1] == arr[3]) {
//            System.out.println("是回文数");
//        } else {
//            System.out.println("不是回文数");
        }

}