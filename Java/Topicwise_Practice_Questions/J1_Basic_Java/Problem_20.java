
/*
Problem_20 :-
Volume Of Prism
 */



package Java.Topicwise_Practice_Questions.J1_Basic_Java;

import java.util.Scanner;

public class Problem_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Base Area of the prism: ");
        float base = input.nextFloat();
        System.out.print("Enter the Length of the prism: ");
        float length = input.nextFloat();
        double volume = base * length;
        System.out.println("Volume Of Cone is = " + volume);
    }
}
