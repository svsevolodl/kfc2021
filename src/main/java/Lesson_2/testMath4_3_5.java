package Lesson_2;
import java.util.Scanner;

class testMath4_3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double y = Math.sin(Math.toRadians(i)) + Math.cos(Math.toRadians(i));
        System.out.println(y);
    }
}
