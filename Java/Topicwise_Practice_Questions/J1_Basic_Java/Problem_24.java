
/*
Problem_24
Curved Surface Area Of Cylinder
 */



package Java.Topicwise_Practice_Questions.J1_Basic_Java;

import java.util.Scanner;

public class Problem_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the Cylinder: ");
        float radius = input.nextFloat();
        System.out.print("Enter the height of the Cylinder: ");
        float height = input.nextFloat();
        double csa = 2 * 3.14 * radius * height;
        System.out.println("Curved Surface Area Of Cylinder is = " + csa);
    }
}
