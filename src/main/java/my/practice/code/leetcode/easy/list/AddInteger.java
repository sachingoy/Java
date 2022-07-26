package my.practice.code.leetcode.easy.list;

import my.practice.code.leetcode.easy.list.base.ListNode;
import my.practice.code.leetcode.easy.list.base.ListNodeUtils;

/*https://leetcode.com/problems/add-two-numbers/
 *
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 */
public class AddInteger {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int sum1 = 0, sum2 = 0, sum = 0, i = 0;
        while (l1 != null) {
            sum1 += (l1.val * Math.pow(10, i++));
            l1 = l1.next;
        }

        i = 0;
        while (l2 != null) {
            sum2 += (l2.val * Math.pow(10, i++));
            l2 = l2.next;
        }

        sum = sum1 + sum2;

        ListNode list = null, temp = null;

        if (sum == 0) {
            list = new ListNode(sum);
        } else {
            while (sum != 0) {
                int val = sum % 10;
                sum = sum / 10;

                if (list == null) {
                    list = new ListNode(val);
                    temp = list;
                } else {
                    while (temp.next != null)
                        temp = temp.next;
                    temp.next = new ListNode(val);
                }
            }
        }
        return list;
    }

    public ListNode addTwoNumbersSol2(ListNode l1, ListNode l2) {

        int val1 = 0;
        int val2 = 0;
        int val3 = 0;
        int carryOver = 0;
        ListNode l3 = null;
        ListNode temp = null;

        while (l1 != null || l2 != null || carryOver != 0) {

            if (l1 != null) {
                val1 = l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                val2 = l2.val;
                l2 = l2.next;
            }

            val3 = val1 + val2 + carryOver;
            if (val3 > 9) {
                carryOver = val3 / 10;
                val3 = val3 % 10;
            } else carryOver = 0;

            if (l3 == null) {
                l3 = new ListNode(val3);
                temp = l3;
            } else {
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = new ListNode(val3);
            }
            val1 = 0;
            val2 = 0;
        }

        return l3;
    }

    public static void main(String[] args) {

        ListNode l1 = ListNodeUtils.create(9);
        ListNode l2 = ListNodeUtils.create(1, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9);

        ListNode list = new AddInteger().addTwoNumbersSol2(l1, l2);
        System.out.print("Final list:- ");
        ListNodeUtils.print(list);
    }
}
