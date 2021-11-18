package BasicCode_03常用API;

import java.util.Random;
import java.util.Scanner;

public class Q32_掷色子游戏_Random {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int seed = scanner.nextInt();
            Random random = new Random(seed);
            //System.out.println(random.nextInt(6));  //random.nextInt(6): 0-5

            //write your code here......
            System.out.println(random.nextInt(6)+1);    //random.nextInt(6)+1: 1-6

        }
    }

}