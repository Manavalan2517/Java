package Java;

public class Arrays_2D {
    public static void main(String[] args) {
        int [][] matrix = new int[5][5];
        for (int i = 0; i<5; i++)
        {
            for (int j = 0; j<5; j++)
            {
                matrix[i][j] = i+j;
                System.out.print(matrix[i][j]+"|");
            }
            System.out.println();
        }
    }
}
