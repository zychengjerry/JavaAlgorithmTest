package BasicCode;

import java.util.Scanner;

public class Q6_BMI体重指数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height = scanner.nextDouble();
        double weight = scanner.nextDouble();

        //write your code here......
        double bmi = weight / (height * height);
        if (bmi < 18.5) System.out.println("BMI =" + bmi + ", 偏瘦");
        else if (bmi >= 18.5 && bmi < 20.9) System.out.println("BMI =" + bmi + ", 苗条");
        else if (bmi >= 20.9 && bmi <= 24.9) System.out.println("BMI =" + bmi + ", 适中");
        else System.out.println("BMI =" + bmi + ", 偏胖");

    }
}