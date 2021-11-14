package BasicCode;

import java.util.*;

public class Q5_CalculateDiscount {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int price = console.nextInt();
        int cost = 0;

        //write your code here......
        if (price >=5000) cost = (int) (price * 0.6);
        else if (price >=2000) cost = (int) (price * 0.7);
        else if (price >=500) cost = (int) (price * 0.8);
        else if (price >=100) cost = (int) (price * 0.9);
        else cost = price;


        System.out.println(cost);
    }
}