package BasicCode_02面向对象_修饰符封装;

import java.util.Scanner;

public class Q24_类型判断_instanceof {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String className = scanner.next();
            Base24 obj = (Base24) Class.forName(className).newInstance();
            System.out.println(getClassName(obj));
        }
    }

    public static String getClassName(Base24 obj) {

        //write your code here......
        if (obj instanceof Sub1) {
            Sub1 sub1 = (Sub1) obj;
            return sub1.getClass().getSimpleName();
        }else if (obj instanceof Sub2) {
            Sub2 sub2 = (Sub2) obj;
            return sub2.getClass().getSimpleName();
        }else return obj.getClass().getSimpleName();

    }

}

class Base24 {

}

class Sub1 extends Base24 {

}

class Sub2 extends Base24 {

}