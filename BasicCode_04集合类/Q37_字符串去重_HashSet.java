package BasicCode_04集合类;

import java.util.HashSet;
import java.util.Scanner;

public class Q37_字符串去重_HashSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        HashSet<Character> hs = new HashSet<>();

        //write your code here......将所有字符添加到HashSet
        for (char c:str.toCharArray()) {
            hs.add(c);  //由于HashSet本身的结构不允许有重复的项，所以会自动去重
        }

        for (char c:hs) {
            System.out.print(c);
        }
    }
}