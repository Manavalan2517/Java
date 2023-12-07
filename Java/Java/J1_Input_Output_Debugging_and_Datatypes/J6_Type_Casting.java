package Java.Java.J1_Input_Output_Debugging_and_Datatypes;

import java.util.Scanner;

public class J6_Type_Casting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Type Casting
        int num = (int)(67.54);
        System.out.println(num);

        float num1 = input.nextFloat();
        int num2 = (int)(num1);
        System.out.println(num2);

        // Automatic Type Promotion in expression
        int num3 = 257;
        byte num4 = (byte)(num3);
        System.out.println(num4);

        byte num_1 = 40;
        byte num_2 = 50;
        byte num_3 = 100;
        int res =  num_1 * num_2 / num_3;
        System.out.println(res);

        int ascii = 'A';
        System.out.println(ascii); // output will be ASCII value of any given number

        byte a = 42;
        char b = 'a';
        short c = 1024;
        int d = 50000;
        float e = 5.67f;
        double f = 0.1234;
        double result = (e * a) + (d / b) - (f - c);
        // Float + Int - Double = Double
        System.out.println((e * a) + " " + (d / b) + " " + (f - c));
        System.out.println(result);



    }
}
