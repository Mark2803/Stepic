/*
На ввод поступает число n.

Программа должна вывести на печать массив размером nxn, состоящий из нолей и единиц, заполненный в шахматном порядке.

Sample Input:

3
Sample Output:

0 1 0
1 0 1
0 1 0
 */

import java.util.Scanner;

public class ChesOrder {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
           if ((i + j) % 2 == 0) {
               arr[i][j] = 0;
           }
           else {
               arr[i][j] = 1;
           }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

