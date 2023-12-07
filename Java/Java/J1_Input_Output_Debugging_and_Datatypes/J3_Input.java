package Java.Java.J1_Input_Output_Debugging_and_Datatypes;

import java.util.Scanner;

public class J3_Input {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.print("Enter your roll number: ");
        int rollno = input.nextInt(); // Input Integer Value

        System.out.print("Enter your name: ");
        String name = input.next(); //Input String Value

        System.out.print("Enter your marks: ");
        float mark = input.nextFloat(); //Input Float Value

        System.out.println("");
        System.out.println("Your Roll Number is: "+rollno); //Output Integer value
        System.out.println("Your name is: "+name); //Output String Valur
        System.out.println("Your Mark is: "+mark); //Output Float value
    }
}