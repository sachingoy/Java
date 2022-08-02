package my.practice.code.leetcode.easy.list.base;


import java.util.Scanner;

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

    public static ListNode createDynamicList() {

        ListNode node = null;
        System.out.println("Enter the node values (enter -1 to exit)");
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (true) {
            System.out.print(String.format("Enter node-%s value : ", i++));
            int input = sc.nextInt();
            if (input == -1)
                break;
            else {
                if (node == null)
                    node = new ListNode();
                insert(node, input);
            }
        }
        if (node != null)
            System.out.print("The given list is : ");
        print(node);
        return node;

    }

    public static void print(ListNode node) {
        if (node == null) {
            System.out.println("Input list is empty..!!");
            return;
        }
        System.out.print("[ ");
        while (true) {
            if (node == null) break;
            else {
                System.out.print(node.val);
                if (node.next == null) {
                    break;
                } else {
                    System.out.print(" -> ");
                    node = node.next;
                }
            }
        }
        System.out.print(" ]");
    }

    public static void main(String[] args) {
        createDynamicList();
        System.out.println();
        ListNode list = create(10, 20, 40, 45, 25);
    }

}
