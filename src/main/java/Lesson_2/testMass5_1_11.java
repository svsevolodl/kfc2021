package Lesson_2;
import java.util.Scanner;


class testMass5_1_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y [] = new int[x+1];
        int c = 0;
        for (int i = 2; i<=x; i+=2) {
            y[i] = (i);
            c = c + y[i];
            System.out.print(" " + y[i]);

        }
        System.out.print("\n"+c);

    }
}

/*
На вход подаётся целое число n > 1. Сформируйте массив чётных чисел от 2 до n (включительно).
Выведите на печать массив в одной строке, через пробел.
Посчитайте и выведите на печать сумму элементов массива.

Sample Input:

10
Sample Output:

2 4 6 8 10
30
 */
