package Lesson_2;
import java.util.Scanner;

class test4_4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if (i%2 == 1 || i%2 == -1) {
                System.out.print(i + " ");
            }
        }
        for (int i = b; i <= a; i++) {
            if (i%2 == -1 || i%2 == 1) {
                System.out.print(i + " ");
            }
        }
        for (int y = a; y == b;) {
            if (y%2 == 1 || y%2 == -1) {
                System.out.print(" ");
            }
        }
    }
}
