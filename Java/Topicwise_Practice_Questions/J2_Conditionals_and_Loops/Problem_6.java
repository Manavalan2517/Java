
// Problem_6 :-
// Calculator


package Java.Topicwise_Practice_Questions.J2_Conditionals_and_Loops;

import java.util.Scanner;

public class Problem_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("To ADD any two numbers press ( + )");
            System.out.println("To SUBTRACT any two numbers press ( - )");
            System.out.println("To MULTIPLY any two numbers press ( * )");
            System.out.println("To DIVIDE any two numbers press ( / )");
            System.out.println("To find Reminder of any two numbers press ( % )");
            System.out.print("Choose any one from the above: ");
            char operator = input.next().trim().charAt(0);

            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
                System.out.print("Enter number 1: ");
                int num1 = input.nextInt();
                System.out.print("Enter number 2: ");
                int num2 = input.nextInt();

                if (operator == '+') {
                    System.out.println("Added value = " + (num1 + num2));
                }

                if (operator == '-') {
                    System.out.println("Subtracted value = " + (num1 - num2));
                }

                if (operator == '*') {
                    System.out.println("Multiplied value = " + (num1 * num2));
                }

                if (operator == '/') {
                    if (num2 != 0) {
                        System.out.println("Divided value = " + (num1 / num2));
                    } else {
                        System.out.println("Denominator should not be zero");
                    }
                }

                if (operator == '%') {
                    System.out.println("Remainder value = " + (num1 % num2));
                }
            }


            else
            {
                System.out.println("Invalid Input");
            }

            System.out.println("Do you want to do any other arithmetic operations?");
            System.out.println("If YES press ( y ) or else press ( n )");
            char conformation = input.next().trim().charAt(0);

            if (conformation == 'n')
            {
                break;
            }
        }
    }
}
