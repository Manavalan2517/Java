package Practice_Questions;
import java.util.Scanner;

public class J5_System_out_printf_function {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("=====================================");
        for (int i = 1; i<=3; i++){
            System.out.println("Enter any text between 1 to 15 characters");
            String s1 = scan.next();
            System.out.println("Enter any 3 numbers");
            int x = scan.nextInt();
            System.out.printf("%-15s%03d\n",s1,x);
        }
    }
}
