package BasicCode_02面向对象_修饰符封装;

public class Q28_创建单例对象_instance {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }

}

class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    //write your code here......
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }return instance;
    }

}