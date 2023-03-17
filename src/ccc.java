
import java.util.Scanner;
public class ccc {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        Scanner input = new Scanner(System.in);

        System.out.print("Input array elements:");
        int num = input.nextInt();
        for (int i = 0; i < array[3][3]; i++) {
            for (int j = 0; j < 3; j++)
                array[i][j] = num;
        }

        System.out.print("Inserted array elements:");
            for (int i = 0; i < array[3][3]; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(" " + array[i][i]);
                }
            }
        System.out.println();
    }
}