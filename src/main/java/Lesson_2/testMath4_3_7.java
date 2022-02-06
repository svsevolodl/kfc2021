package Lesson_2;
import java.util.Scanner;

class testMath4_3_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double y = Math.pow(10, i);
        if (i>0) {
            System.out.println(Math.round(Math.PI * y)/y);
        }else if (i==0) {
            System.out.println(3);
        }else {
            System.out.println("NOPE");
        }

    }
}