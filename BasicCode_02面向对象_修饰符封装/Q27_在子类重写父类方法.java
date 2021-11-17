package BasicCode_02面向对象_修饰符封装;

import java.util.Scanner;

public class Q27_在子类重写父类方法 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Sub27 sub = new Sub27(x, y);
            System.out.println(sub.sum());
        }
    }

}

class Base27 {

    private int x;
    private int y;

    public Base27(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public final int getY() {
        return y;
    }

    public final int sum() {
        return getX() + getY();
    }

}

class Sub27 extends Base27 {

    public Sub27(int x, int y) {
        super(x, y);
    }

    //write your code here......
    public int getX() {
        return super.getX() * 10;
    }

}