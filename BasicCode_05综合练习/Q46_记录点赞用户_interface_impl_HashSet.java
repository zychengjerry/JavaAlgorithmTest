package BasicCode_05综合练习;

import java.util.*;

public class Q46_记录点赞用户_interface_impl_HashSet {

    public static void main(String[] args) {
        LikeRecorder recorder = new LikeRecorderImpl();

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (scanner.hasNext() && count < 7) {
            String name = scanner.next();
            recorder.like(name);
            count++;
        }

        System.out.println(Arrays.toString(recorder.getLikeUsers()));
    }

}

/**
 * 点赞记录器
 */
interface LikeRecorder {

    /**
     * 若用户没有点赞过，则记录此次点赞行为。
     * 若用户曾经点赞过，则删除用户点赞记录。
     *
     * @param username 用户名
     */
    void like(String username);

    /**
     * 返回所有点赞的用户名
     *
     * @return 用户名数组
     */
    String[] getLikeUsers();

}

class LikeRecorderImpl implements LikeRecorder {

    // write your code here......
    private HashSet<String> names = new HashSet();

    @Override
    public void like(String name) {
        if (names.contains(name)) {
            names.remove(name);
        }else names.add(name);
    }

    @Override
    public String[] getLikeUsers() {
        return names.toArray(new String[0]);
    }

}