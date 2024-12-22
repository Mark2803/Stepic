/*
На вход поступают два целых числа n и m и массив размером nxm.

Необходимо распределить элементы в каждой строке по возрастанию и вывести полученный массив на экран.

Sample Input:

5
5
1 4 8 3 5
9 5 3 8 0
6 4 1 8 2
1 7 5 9 2
9 5 1 0 4
Sample Output:

1 3 4 5 8
0 3 5 8 9
1 2 4 6 8
1 2 5 7 9
0 1 4 5 9
 */

import java.util.Arrays;
import java.util.Scanner;
public class SortNUmsInStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int[][] arr = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = in.nextInt();

            }
        }

        for (int i = 0; i < x; i++) {
            Arrays.sort(arr[i]);
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
