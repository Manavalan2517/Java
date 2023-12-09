/*
 Problem_2 :-
 Alphabet check case
*/

package Java.Topicwise_Practice_Questions.J2_Conditionals_and_Loops;

import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any string: ");

        char ch = input.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z')
        {
            System.out.println("Lowercase");
        }
        else
        {
            System.out.println("Uppercase");
        }
    }
}
