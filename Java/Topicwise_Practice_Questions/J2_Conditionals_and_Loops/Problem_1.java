
// Problem_1 :-
// Take 2 numbers as input and print the largest number.


package Java.Topicwise_Practice_Questions.J2_Conditionals_and_Loops;

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        int num1 = input.nextInt();

        System.out.print("Enter Number 2: ");
        int num2 = input.nextInt();

        System.out.print("Enter Number 3: ");
        int num3 = input.nextInt();

        int max = 0;
        if (num1 > num2 && num1 >num3)
        {
            max = num1;
            System.out.println(num1+" is the largest number");
        }
        else if (num2 > num1 && num2 > num3)
        {
            max = num2;
            System.out.println(num2+" is the largest number");
        }
        else
        {
            max = num3;
            System.out.println(num3+" is the largest number");
        }
    }
}
