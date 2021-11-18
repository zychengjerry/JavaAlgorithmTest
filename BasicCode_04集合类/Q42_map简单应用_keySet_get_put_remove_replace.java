package BasicCode_04集合类;

import java.util.*;

public class Q42_map简单应用_keySet_get_put_remove_replace {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String name = scanner.next();
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Amy");
        map.put(2, "Joe");
        map.put(3, "Tom");
        map.put(4, "Susan");

        //write your code here......
        for (Integer key:map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }

        map.put(5, name);
        map.remove(4);
        map.replace(3, "Tommy");

        System.out.println();

        for (Integer key:map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }

    }
}