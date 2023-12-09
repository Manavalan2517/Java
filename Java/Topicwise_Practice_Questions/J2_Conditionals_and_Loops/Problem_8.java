/*
 Problem_8 :-
 To find out whether the given String is Palindrome or not.
*/


package Java.Topicwise_Practice_Questions.J2_Conditionals_and_Loops;

import java.util.Scanner;

public class Problem_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String original = input.next();
//        for (int i = 0; i <= original.length() - 1 ; i++)
//        {
//            System.out.println(i + "  ");
//        }

        int total = original.length()-1;
        int i = 0;
        int pos_count = 0;
        int neg_count = 0;

        while (total >= 0)
        {
            if (original.charAt(i) == original.charAt(total))
            {
                pos_count++;
                i++;
                total--;
            }
            else
            {
                neg_count++;
            }
            if (neg_count > 0)
            {
                System.out.println("Given String is not palindrome");
                break;
            }
            else
            {
                System.out.println("Given String is a palindrome");
                break;
            }
        }
    }
}
