/*
На ввод поступает два целых числа n, m - размер массива, сам массив.

Программа должна вывести через пробел числа, которые находятся на главной диагонали.

Sample Input:

3 3
1 5 2
8 3 0
5 6 1
Sample Output:

1 3 1
 */

import java.util.Scanner;

public class DiagonalPrint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество строк: ");
        int x = in.nextInt();
        System.out.println("Введите количество столбцов: ");
        int y = in.nextInt();
        int[][] arr = new int[x][y];

        // Заполнение массива цифрами
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        // Вывод массива на печать
        System.out.println("Заданный массив: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //Подсчет диаганали
        System.out.println("Число по диагонали: ");
        for (int i = 0; i < x; i++) {
                System.out.print(arr[i][i] + " ");
            }

        }
    }

