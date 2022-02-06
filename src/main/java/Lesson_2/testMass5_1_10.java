package Lesson_2;
import java.util.Scanner;


class testMass5_1_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int array[] = new int[len];
        for (int i = 0; i<len; i++){
            array[i]= sc.nextInt();
        }
        int id = sc.nextInt();
        System.out.println(array[id]);

    }
}
/*На вход подаётся натуральное число n > 0, на следующей строке - последовательность целых чисел, а затем - индекс id < n. Создайте из неё массив и выведите на печать значение элемента массива c индексом id.

Sample Input:

5
1 2 3 4 5
1
Sample Output:

2

 */