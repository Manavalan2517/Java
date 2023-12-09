
/*
Problem_13 :-
Perimeter Of Circle
 */



package Java.Topicwise_Practice_Questions.J1_Basic_Java;

import java.util.Scanner;

public class Problem_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        float radius = input.nextFloat();
        double perimeter = 2 * 3.14 * radius;
        System.out.println("Perimeter Of Circle is = " + perimeter);
    }
}
