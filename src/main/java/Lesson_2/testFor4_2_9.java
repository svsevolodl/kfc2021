package Lesson_2;
import java.util.Scanner;

class testFor4_2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 1; i <= a; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j+(j==i?"":" "));
            }
            System.out.println();
        }
    }
}

