/*
На ввод поступает два целых числа n, m - размер массива, сам массив.

Вывести этот же массив, где каждое четное число увеличено на 1 (все элементы массива должны быть разделены пробелами).

Sample Input:

3 3
1 4 2
3 3 8
1 8 2
Sample Output:

1 5 3
3 3 9
1 9 3
 */
import java.util.Scanner;
public class EvenPlusOne {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int x = in.nextInt();
        System.out.println("Введите количество столбцов: ");
        int y = in.nextInt();
        int [][] arr = new int[x][y];

        System.out.println("Введите числа массива: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("Вывод массива, четные + 1: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (arr[i][j] % 2 == 0) {
                    System.out.print(arr[i][j] + 1 + " ");
                }
                else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}
