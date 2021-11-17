package BasicCode_01基础语法;

public class Q9_AddSum数列求和 {
    public static void main(String[] args) {

        //write your code here........
        // 有数列为：9，99，999，...，9999999999。要求使用程序计算此数列的和，并在控制台输出结果。
        // （请尝试使用循环的方式生成这个数列并同时在循环中求和）
        long sum = 0;
        long base = 9;
        for (int i = 0; i<10; i++){
            sum += base;
            base = base * 10 + 9;
        }
        System.out.println(sum);

    }
}