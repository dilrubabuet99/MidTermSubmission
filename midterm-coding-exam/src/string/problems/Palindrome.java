package string.problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string ");
        String str = sc.nextLine();

        int lenStr = str.length();
        String revStr = "";
        for (int i = lenStr - 1; i >= 0; i--) {
            revStr = revStr + str.charAt(i);

        }

        if (str.equals(revStr)) {
            System.out.println("The entered string is a Palindrome .");
        } else {
            System.out.println("The entered string is not  a Palindrome .");

        }


    }
}