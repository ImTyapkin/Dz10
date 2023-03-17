import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(in);
        System.out.println("Введите количество строк двумерного массива (матрицы): ");
        int size1 = input.nextInt(); // Ввод размера строк
        System.out.println("Введите количество столбцов двумерного массива (матрицы): ");
        int size2 = input.nextInt(); // Ввод размера столбцов
        int[][] array = new int[size1][size2];
        System.out.println("Ввод значений двумерного массива (матрицы):");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Введите значения ячеек в матрицу[" + i + "][" + j + "]:");
                array[i][j] = input.nextInt();
            }
        }
        input.close();
        System.out.println("Вывод на экран получившейся таблицы:");
        for (int i = 0; i < size1; i++) {  //по строкам
            for (int j = 0; j < size2; j++) { //по столбцам
                System.out.print(" " + array[i][j] + " "); //вывод значений по строк
            }
            System.out.println();//вывод на экран в виде таблицы
        }
        System.out.println("Вывод на экран первой строки матрицы и умноженный на 3:");
        for (int i = 0; i < size2; i++) {
            System.out.print(" " + array[0][i] * 3 + " ");
        }
    }
}
