package BasicCode_05综合练习;

import java.util.Scanner;

public class Q44_判断各类型字符个数_for_if_charAt_API {
    public static void main(String[] args) {
        int numbers = 0;
        int words = 0;
        int space = 0;
        int other = 0;
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        //write your code here......
        // 正常方法
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (c >= '0' && c <= '9'){
                numbers++;
            }else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                words++;
            }else if (c == ' '){
                space++;
            }else other++;
        }

        // API方法
//        for (int i = str.length()-1; i>=0; i--) {
//            char c = str.charAt(i);
//            if (Character.isLetter(c)){
//                words++;
//            }else if (Character.isDigit(c)){
//                numbers++;
//            }else if (Character.isWhitespace(c)){
//                space++;
//            }else other++;
//        }

        System.out.println("英文字母"+words+"数字"+numbers+"空格"+space+"其他"+other);
    }
}