/*
Найдите индексы первого вхождения минимально элемента.
Формат входных данных
Программа получает на вход размеры массива n и m, и сам массив
Формат выходных данных
Выведите два числа: индекс строки и индекс столбца, в которых стоит наименьший элемент в двумерном массиве. Если таких элементов несколько, то выводится тот, у которого меньше номер строки, а если номера строк равны то тот, у которого меньше номер столбца.

Sample Input:

2 4
2 3 2 4
2 3 0 5
Sample Output:

1 2
 */

import java.util.Scanner;

public class FirstInMinNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();

        int[][] arr = new int[x][y];

        // Заполнение двумерного массива
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int minRow = 0;
        int minCol = 0;
        int minVal = arr[0][0];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (arr[i][j] < minVal) {
                    minVal = arr[i][j];
                    minRow = i;
                    minCol = j;
                    System.out.print(minRow + " " + minCol + " ");
                }
            }
        }
        in.close();
    }
}