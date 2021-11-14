package BasicCode;

import java.util.*;

public class Q11_最小公倍数 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int m = console.nextInt();
        int n = console.nextInt();
        int result = getCM(m, n);
        System.out.println(result);
    }

    public static int getCM(int m, int n){

        //write your code here......
        int max = Math.max(m, n);
        int min = Math.min(m, n);
        int i;
        for (i = min; i<=min*max;i++) {
            if (i%min == 0 && i%max == 0) {
                return i;
            }
        }
        return 0;

    }
}