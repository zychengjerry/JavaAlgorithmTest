package BasicCode;

import java.util.Scanner;

public class Q8_StringMatches {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        //123123@nowcoder.com
        String emailMatcher="[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+";

        //write your code here......
        System.out.println(str.matches(emailMatcher)?"邮箱格式合法":"邮箱格式不合法");

    }
}