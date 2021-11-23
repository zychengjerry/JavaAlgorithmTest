package HW;

/*数据表记录包含表索引和数值（int范围的正整数），
请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
提示:
0 <= index <= 11111111
1 <= value <= 100000

输入描述：
先输入键值对的个数n（1 <= n <= 500）
然后输入成对的index和value值，以空格隔开

输出描述：
输出合并后的键值对（多行）

示例1
输入：
4
0 1
0 2
1 2
3 4

输出：
0 3
1 2
3 4*/

import java.util.*;

/**
 *
 * @author: JerryCheng
 * Date: 2021/11/23 15:46
 */
public class HJ8_合并表记录_HashMap_key_value_put_get {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        Map<Integer, Integer> table = new HashMap<>(size);

        for (int i = 0; i < size; i++) {
            int key = scan.nextInt();
            int value = scan.nextInt();
            if (table.containsKey(key)) {
                table.put(key, table.get(key) + value);
            }else {
                table.put(key, value);
            }
        }
        for (Integer key : table.keySet()) {
            System.out.println(key + " " + table.get(key));
        }
    }

}