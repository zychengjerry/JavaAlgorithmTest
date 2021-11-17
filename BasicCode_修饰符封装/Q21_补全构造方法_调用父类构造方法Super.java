package BasicCode_修饰符封装;

import java.util.Scanner;

public class Q21_补全构造方法_调用父类构造方法Super {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            Sub21 sub = new Sub21(x, y, z);
            System.out.println(sub.calculate());
        }
    }

}

class Base21 {

    private int x;
    private int y;

    public Base21(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}

class Sub21 extends Base21 {

    private int z;

    public Sub21(int x, int y, int z) {

        //write your code here
        super(x, y);
        this.z = z;

    }

    public int getZ() {
        return z;
    }

    public int calculate() {
        return super.getX() * super.getY() * this.getZ();
    }

}