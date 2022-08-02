package my.practice.code.util;

import java.util.Arrays;
import java.util.Scanner;

public class InputUtil {

    public static int inputNumber()
    {
        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        return num;
    }

    public static String inputString()
    {
        System.out.println("Enter string : ");
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        sc.close();
        return string;
    }

    public static char[] inputCharacters()
    {
        System.out.print("Enter characters : ");
        Scanner sc = new Scanner(System.in);
        char[] ch = sc.nextLine().toCharArray();
        System.out.println("Input character array is : "+ Arrays.toString(ch));
        sc.close();
        return ch;
    }


}
