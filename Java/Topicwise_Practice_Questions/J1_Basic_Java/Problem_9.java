
/*
Problem_9 :-
Area Of Parallelogram
 */



package Java.Topicwise_Practice_Questions.J1_Basic_Java;

import java.util.Scanner;

public class Problem_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the height of the parallelogram: ");
        float height = input.nextFloat();
        System.out.print("Enter the base of the parallelogram: ");
        float base = input.nextFloat();
        double area =  height * base;
        System.out.println("Area Of Parallelogram is = " + area);
    }
}
