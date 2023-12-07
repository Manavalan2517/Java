package Java.Java.J2_Conditionals_and_Loops;

public class Conditional_Statements_Switch_Case {
    public static void main(String[] args) {
        char att = 'a';
        switch (att)
        {
            case 'o':
                System.out.println("On-Duty");
                break;
            case 'a':
                System.out.println("Absent");
                break;
            case 'p':
                System.out.println("Present");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}