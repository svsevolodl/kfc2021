package Lesson_2;
import java.util.Scanner;


class testMass5_1_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int array[] = new int[len];
        for (int i = 0; i<len; i++){
            array[i]= sc.nextInt();
        }
        System.out.println(array[len-1]);

    }
}
/*
На вход подаётся натуральное число n > 0 (длина массива), а на следующей строке - последовательность целых чисел.
Создайте из неё массив и выведите на печать значение последнего элемента массива.

Sample Input:

5
1 2 3 4 5
Sample Output:

5
 */