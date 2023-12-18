
/*
Problem_15 :-
Calculate Discount Of Product
 */



package Java.Topicwise_Practice_Questions.J2_Conditionals_and_Loops;

import java.util.Scanner;

public class Problem_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Press ('n') to stop the loop");
        int i = 0;
        int count = 0;
        double numerator = 0;
        while (true)
        {
            i++;
            System.out.print("Enter number " + i + ": ");
            int num = input.nextInt();
            count++;
            numerator += num;

            System.out.print("Do you want add another number (y/n): ");
            char brk = input.next().trim().charAt(0);
            if (brk == 'n' || brk == 'N')
            {
                break;
            }
        }
        double avg = numerator / count;
        System.out.println(avg);
    }
}