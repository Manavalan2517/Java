package Practice_Questions;

import java.util.Scanner;

public class J2_Standard_Input_and_Output_I {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //System.out.println("Enter Number 1: ");
        int num_1 = scanner.nextInt();
        //System.out.println("Enter Number 2: ");
        int num_2 = scanner.nextInt();
        //System.out.println("Enter Number 3: ");
        int num_3 = scanner.nextInt();
        scanner.close();

        System.out.println(num_1);
        System.out.println(num_2);
        System.out.println(num_3);
    }
}
