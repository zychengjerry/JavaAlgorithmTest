package BasicCode;

import java.util.*;

public class Q10_统计输入正数个数 {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        //write your code here......
        while (true){
            if (scanner.nextInt()>0) {
                count ++;
            } else {
                System.out.println(count);
                break;
            }
        }

    }
}