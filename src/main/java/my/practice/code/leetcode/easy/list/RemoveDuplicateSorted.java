package my.practice.code.leetcode.easy.list;

/*
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 * Input : [1-1-2-3-3-3-3-4-4]
 * Output : [1-2-3-4]
 */

import my.practice.code.leetcode.easy.list.base.ListNode;
import my.practice.code.leetcode.easy.list.base.ListNodeUtils;

public class RemoveDuplicateSorted {

    public static ListNode deleteDuplicates(ListNode head) {

        System.out.println("Input list : ");
        ListNodeUtils.print(head);

        ListNode temp = head;
        ListNode running = temp;

        while (temp!=null && temp.next != null) {

            while (running.next != null && running.next.val == running.val)
                running = running.next;

            temp.next = running.next;
            temp = temp.next;
            running = temp;
        }

        System.out.println("Output list : ");
        ListNodeUtils.print(head);

        return head;

    }

    public static void main(String[] args) {
        ListNode list = ListNodeUtils.create(1, 2, 2, 2, 3, 4, 4, 5, 6, 6, 7, 7, 7, 7, 7);
        deleteDuplicates(list);
    }
}
