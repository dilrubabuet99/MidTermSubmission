package string.problems;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

                Scanner sc =new Scanner(System.in);
                System.out.println("Enter First String: ");
                String str1 = sc.nextLine();
                System.out.println("Enter Second String: ");
                String str2 = sc.nextLine();

                char [] ca1=str1.toCharArray();
                Arrays.sort(ca1);
                char [] ca2=str2.toCharArray();
                Arrays.sort(ca2);
                if(ca1.length==ca2.length&&Arrays.equals(ca1,ca2))
                {
                    System.out.println("The given two Strings are Anagrams");
                }
                else{
                    System.out.println("The given two strings are not Anagrams");
                }

            }
    }

