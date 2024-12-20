/*
На ввод поступает два целых числа n, m - размер массива, сам массив и целое число k.

Программа должна вывести сумму чисел в строке под номером k.

Sample Input:

        3 3
        1 2 3
        4 5 6
        7 8 9
        2
Sample Output:

        15
*/

import java.util.Scanner;

public class SummNummIntoString {
    public static void main(String[] args) {
        TwoDimensionalArray();
    }


    // Метод для создания двумерного массива
    public static void TwoDimensionalArray() {
        Scanner in = new Scanner(System.in);

        // Ввод размеров массива
        System.out.print("Введите количество строк: ");
        int x = in.nextInt();
        System.out.print("Введите количество столбцов: ");
        int y = in.nextInt();

        int[][] arr = new int[x][y];

        // Ввод элементов массива
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        // Вывод элементов массива
        System.out.println("Введенный массив:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                // arr[i][j] = in.nextInt();
                System.out.print(arr[i] [j] + " ");
            }
            System.out.println();
        }
        in.close(); // Закрываем Scanner
    }
}