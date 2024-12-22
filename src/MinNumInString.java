/*
На ввод поступает массив размером 4х4.

Найти минимальны элемент в каждой строке и вывести минимальные элементы на экран.

Sample Input:

        8 9 4 3
        1 9 4 2
        4 7 5 3
        5 8 1 4
Sample Output:

        3 1 3 1
*/

import java.util.Scanner;
public class MinNumInString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[4][4];
        System.out.println("Введите 16 чисел массива: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("Заданный массив: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Наименьшие числа в каждой строке: ");
        for (int i = 0; i < 4; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < 4; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
            System.out.print(min + " ");
        }
    }
}


