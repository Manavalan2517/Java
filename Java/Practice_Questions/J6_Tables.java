package Practice_Questions;
import java.util.Scanner;

public class J6_Tables {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();
        scan.close();
        for (int i = 1; i<11; i++)
        {
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}
