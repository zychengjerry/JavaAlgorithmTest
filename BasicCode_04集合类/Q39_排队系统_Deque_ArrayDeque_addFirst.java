package BasicCode_04集合类;

import java.util.*;

public class Q39_排队系统_Deque_ArrayDeque_addFirst {
    public static void main(String[] args) {
        Guest guest1 = new Guest("小明",false);
        Guest guest2 = new Guest("小军",false);
        Guest vipGuest = new Guest("小红",true);
        Deque<Guest> deque = new ArrayDeque<>();
        deque.add(guest1);
        deque.add(guest2);

        //write your code here......
        deque.addFirst(vipGuest);   //加到队列第一个

        System.out.println(deque);
    }
}
class Guest{
    String name;
    Boolean vip;

    @Override
    public String toString() {
        return name;
    }

    public Guest(String name, Boolean vip) {
        this.name = name;
        this.vip = vip;

    }
}