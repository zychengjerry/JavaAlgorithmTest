package BasicCode_04集合类;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Q40_首尾交替出队_Deque_pollFirst {

    public static void main(String[] args) {
        ArrayDeque deque = new ArrayDeque();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            String name = scanner.next();
            // 初始化队列中的数据
            deque.offerLast(name);
        }

        // write your code here......
        int len = deque.size();
        for (int i = 0; i < len; i++) {
            if (i%2 == 0) {
                System.out.println(deque.pollFirst());
            }else {
                System.out.println(deque.pollLast());
            }
        }

    }

}