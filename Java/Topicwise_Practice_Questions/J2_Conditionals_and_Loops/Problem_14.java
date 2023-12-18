
/*
Problem_14 :-
Calculate Electricity Bill
 */




package Java.Topicwise_Practice_Questions.J2_Conditionals_and_Loops;

import java.util.Scanner;

public class Problem_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the total units: ");
        int unit = input.nextInt();

        if (unit <= 100)
        {
            int amount = unit * 10;
            System.out.println("Amount =" + amount);
        }
        else if (unit > 100 && unit <= 200)
        {
            int amount1 = 100 * 10;
            unit -= 100;
            int amount2 = unit * 15;
            System.out.println("Amount =" + (amount1 + amount2));
        }
        else if (unit > 200 && unit <= 300)
        {
            int amount1 = 100 * 10;
            int amount2 = 100 * 15;
            unit -= 200;
            int amount3 = unit * 20;
            System.out.println("Amount =" + (amount1 + amount2 + amount3));
        }
        else
        {
            int amount1 = 100 * 10;
            int amount2 = 100 * 15;
            int amount3 = 100 * 20;
            unit -= 300;
            int amount4 = unit * 25;
            System.out.println("Amount =" + (amount1 + amount2 + amount3 + amount4));
        }
    }
}
