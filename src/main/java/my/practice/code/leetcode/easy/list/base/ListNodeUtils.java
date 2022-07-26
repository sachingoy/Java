package my.practice.code.leetcode.easy.list.base;


public class ListNodeUtils {

    public static void insert(ListNode node, int val) {
        if (node == null)
            return;
        else {
            while (node.next != null)
                node = node.next;
            if (node.val == -1)
                node.val = val;
            else
                node.next = new ListNode(val);
        }
    }

    public static ListNode create(int... nums) {
        ListNode node = new ListNode();
        for (int num :
                nums) {
            insert(node, num);
        }
        System.out.print("List created:- ");
        print(node);
        System.out.println();
        return node;
    }

    public static void print(ListNode node) {
        while (true) {
            if (node == null) break;
            else {
                System.out.print(node.val + " ");
                if (node.next == null) break;
                else node = node.next;
            }
        }
    }

    public static void main(String[] args) {
        ListNode list = create(10, 20, 40, 45, 25);
    }

}
