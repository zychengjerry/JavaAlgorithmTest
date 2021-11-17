package BasicCode_修饰符封装;

import java.util.Scanner;

public class Q22_重写计算逻辑_extendSuper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Sub22 sub = new Sub22(x, y);
            sub.calculate();
        }
    }

}

class Base22 {

    private int x;
    private int y;

    public Base22(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void calculate() {
        System.out.println(getX() * getY());
    }

}

class Sub22 extends Base22 {

    //write your code here......
    public int x;
    public int y;

    public Sub22(int x, int y) {
        super(x,y);
    }

    public void calculate() {
        if (getY()==0){
            System.out.println("Error");
        }else System.out.println(getX()/getY());
    }

}