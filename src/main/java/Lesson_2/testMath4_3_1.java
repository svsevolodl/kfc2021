package Lesson_2;
import java.util.Scanner;

class testMath4_3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        double z = Math.pow(x,y);
        System.out.println(z);
    }
}
