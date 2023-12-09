
/*
Problem_21 :-
Volume Of Cylinder
 */



package Java.Topicwise_Practice_Questions.J1_Basic_Java;

import java.util.Scanner;

public class Problem_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the Cylinder: ");
        float radius = input.nextFloat();
        System.out.print("Enter the height of the Cylinder: ");
        float height = input.nextFloat();
        double volume = 3.14 * radius * radius * height;
        System.out.println("Volume Of Cylinder is = " + volume);
    }
}
