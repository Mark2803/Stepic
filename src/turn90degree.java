/*
На ввод поступает два целых числа n, m - размер массива, сам массив.

Вывести этот же массив, провернув его на 90 градусов по часовой стрелке

Sample Input:

3 3
1 2 3
4 5 6
7 8 9
Sample Output:

7 4 1
8 5 2
9 6 3
 */

import java.util.Scanner;

public class turn90degree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int[][] arr = new int[x][y];

        //  System.out.println("Заполните массив числами: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        //System.out.println("Вывод массива: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr[i][j] + " ");
            }
           // System.out.println();
        }
       // System.out.println();
        // Создание нового массива с перевернутыми значениями
        int[][] turnArray = new int[y][x];
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                turnArray[j][x - 1 - i] = arr[i][j];
            }
        }
        // Печать нового масссива
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(turnArray[i][j] + " ");
            }
           // System.out.println();
        }


    }
}
