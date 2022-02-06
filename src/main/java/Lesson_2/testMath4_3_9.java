package Lesson_2;
import java.util.Scanner;


class testMath4_3_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble();
        double c = Math.round((Math.sqrt(Math.pow(a, 2)+Math.pow(b,2)))+a+b);
        System.out.print(c);
    }
}
