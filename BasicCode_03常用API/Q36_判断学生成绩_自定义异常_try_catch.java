package BasicCode_03常用API;

import java.util.*;

public class Q36_判断学生成绩_自定义异常_try_catch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        //write your code here......
        try {
            if (score >= 0 && score <= 100) {
                System.out.println(score);
            }else {
                throw new ScoreException("分数不合法");
            }
        } catch (ScoreException e) {
            System.out.println(e.getMessage());
        }
    }
}

class ScoreException extends Exception {

    //write your code here......
    ScoreException(String message) {
        super(message);
    }

}