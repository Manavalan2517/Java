package Java;

public class Jump_Statements_break_continue {
    public static void main(String[] args) {
        for (int i = 1; i<=10; i++){
            if (i == 5) {
                continue;
            }
            if (i==10){
                break;
            }
            System.out.println(i);

        }
    }
}
