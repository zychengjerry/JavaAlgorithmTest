package AdvancedCode_算法进阶;

import java.util.*;
import java.util.List;
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 * 1.链表从中间位置截断
 * 2.反转后半部分链表
 * 3.两个链表交叉合并
 */
public class AC2_重排链表_ListNode_ArrayList {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public void reorderList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null)
            return;
        ListNode l1 = head;
        ListNode l2 = reverse(getMiddleNode(head));
        head = crossMerge(l1, l2);
    }

    public static ListNode getMiddleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode slowPre = head;
        while (fast.next != null && fast.next.next != null) {
            slowPre = slow;
            slow = slow.next;
            fast = fast.next.next;

        }
        if (fast.next == null) {
            slowPre.next = null;
            return slow;
        } else {
            ListNode temp = slow.next;
            slow.next = null;
            return temp;
        }
    }

    public static ListNode reverse(ListNode head) {
        ListNode tail = head;
        head = head.next;
        tail.next = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = tail;
            tail = head;
            head = temp;
        }
        return tail;
    }

    public static ListNode crossMerge(ListNode l1, ListNode l2) {
        ListNode head = l1;
        while (l1 != null) {
            ListNode temp1 = l1.next;
            l1.next = l2;
            ListNode temp2 = l2.next;
            if (temp1 != null) {
                l2.next = temp1;
            }
            l2 = temp2;
            l1 = temp1;
        }
        return head;
    }
}