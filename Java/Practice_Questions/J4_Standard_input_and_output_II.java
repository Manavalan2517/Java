package Practice_Questions;
import java.util.Scanner;
public class J4_Standard_input_and_output_II {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int i = scanner.nextInt();
        System.out.println("Enter Decimal Values: ");
        double d = scanner.nextDouble();
        System.out.println("Enter any sentence");
        scanner.nextLine();
        String s = scanner.nextLine();
        scanner.close();

        // Output
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
