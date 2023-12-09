
/*
Problem_16 :-
Perimeter Of Rectangle
 */



package Java.Topicwise_Practice_Questions.J1_Basic_Java;

import java.util.Scanner;

public class Problem_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of a rectangle: ");
        float length = input.nextFloat();
        System.out.print("Enter the Side breadth of a rectangle: ");
        float breadth = input.nextFloat();
        double perimeter =  2 * (length + breadth);
        System.out.println("Perimeter Of Rectangle is = " + perimeter);
    }
}
