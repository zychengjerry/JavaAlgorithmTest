package BasicCode_04集合类;

import java.util.*;

public class Q41_统计一句话中重复单词的个数_Map_put_get_containsKey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

        //write your code here......
        line = line.replaceAll("[^a-zA-Z]",""); //[^a-zA-Z]: 除了字母外的所有字符

        for (int i = 0; i < line.length(); i ++){
            char c = line.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entrys = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entrys) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}