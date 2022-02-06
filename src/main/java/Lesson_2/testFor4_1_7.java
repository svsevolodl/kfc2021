package Lesson_2;
import java.util.Scanner;

class testFor4_1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            System.out.print("\n");
            for (int b = 1; b<= y; b++) {
                System.out.print("*");
            }
        }

    }
}
