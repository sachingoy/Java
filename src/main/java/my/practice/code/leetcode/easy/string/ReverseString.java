package my.practice.code.leetcode.easy.string;

import java.util.Arrays;

public class ReverseString {

    public static void reverseString(char[] s) {

        int len = s.length;
        for (int i = 0, j = len - 1; i < len / 2; i++, j--) {
            char c = s[i];
            s[i] = s[j];
            s[j] = c;
        }
        System.out.println("Output character array is : "+Arrays.toString(s));
    }

}
