package my.practice.code.leetcode.easy.loop;

import java.util.Scanner;

public class ReverseInteger {

    public static int reverse(int x) {
        int sum = 0;
        while (x != 0) {
            int mod = x % 10;
            x = x / 10;
            if ((sum > Integer.MAX_VALUE / 10) || (sum == Integer.MAX_VALUE / 10 && mod > 7))
                return 0;
            if((sum < Integer.MIN_VALUE / 10) || (sum == Integer.MIN_VALUE / 10 && mod < -8))
                return 0;
            sum = sum * 10 + mod;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = sc.nextInt();
        System.out.println("Reversed num : " + reverse(num));
    }
}
