package Java;

public class nested_loop {
    public static void main(String[] args) {
        for (int i = 1; i<=4; i++)
        {
            System.out.println("\nWeek "+i+"\n");
            for (int j = 1; j<=7; j++)
            {
                System.out.println("\t Day "+j);
            }
        }
    }
}
