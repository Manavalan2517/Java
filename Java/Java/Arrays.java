package Java;

public class Arrays {
    public static void main(String[] args) {
        //Method 1
        int[] roll = new int[10];
        roll[0] = 1;
        roll[1] = 2;
        roll[2] = 3;
        System.out.println("RollNo 1: "+roll[0]);
        System.out.println("RollNo 2: "+roll[1]);
        System.out.println("RollNo 3: "+roll[2]);
        System.out.println("=======================================");


        //Method 2
        int[] rollno = new int[2000];
        int index = 0;
        for (int i = 1201; i<1211; i++) {
            index++;
            rollno[index] = i;
            System.out.println("Roll No " + index + ": " + rollno[index]);
        }
        System.out.println("=======================================");

        //Method 3
        int[] roll_no = new int[1211];
        for (int i = 1; i<10;)
        {
            for (int j = 1201; j<1211; j++)
            {
                roll_no[i] = j;
                int ind = j;
                ind -= 1200;
                System.out.println("RollNo "+ind+": "+roll_no[i]);
            }
            System.out.println("=======================================");
            break;

        }
    }
}
