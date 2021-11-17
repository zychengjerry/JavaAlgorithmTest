package BasicCode_修饰符封装;

import java.util.Scanner;

public class Q20_验证年龄_publicVoid {

    public static void main(String[] args) {
        Person p = new Person();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            p.setAge(age);
            System.out.println(p.getAge());
        }
    }

}

class Person {

    private int age;

    //write your code here......
    public void setAge(int age) {
        if (age>200){
            this.age = 200;
        }else if (age>=0 && age<=200) {
            this.age = age;
        }else this.age = 0;
    }

    public int getAge() {
        return age;
    }

}