/*
Вывести двумерный массив
в виде таблицы умножения
 */

public class MultiplicationTable {
    public static void main(String[] args) {
       int[][] arr = new int[10][10];

       for (int i = 0; i < 10; i++) {
           for (int j = 0; j < 10; j++) {
               arr[i][j] = (i + 1) * (j + 1);           }
       }
       for (int i = 0; i < 10; i++) {
           for (int j = 0; j < 10; j++) {
               System.out.print(arr[i][j] + " ");
           }
           System.out.println();
       }
    }
}
