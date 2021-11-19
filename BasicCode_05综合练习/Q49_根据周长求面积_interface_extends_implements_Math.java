package BasicCode_05综合练习;

import java.util.Scanner;

public class Q49_根据周长求面积_interface_extends_implements_Math {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextDouble()) {
            double s = scanner.nextDouble();
            // Circle和Square是需要你定义的类
            System.out.println(String.format("%.3f",new Circle(s).getArea()));
            System.out.println(String.format("%.3f", new Square(s).getArea()));
        }
    }

}

class Shape {

    private double s; // 周长

    public Shape(double s) {
        this.s = s;
    }

    public double getS() {
        return s;
    }

}

interface Area {
    double getArea(); // 面积
}

// 圆形
class Circle extends Shape implements Area {

    //write your code here......
    public Circle(double s) {
        super(s);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(getS() / (2 * Math.PI), 2);
    }

}

// 方形
class Square extends Shape implements Area {

    //write your code here......
    public Square(double s) {
        super(s);
    }

    @Override
    public double getArea() {
        return Math.pow(getS()/4, 2);
    }

}