package Lesson_2;
import java.util.Scanner;


class test4_4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num>1) {
            if (num%2!=0) {
                if (num%3!=0) {
                    System.out.println("true");
                }else {
                    System.out.println("false");
                }
            }else {
                System.out.println("false");
            }
        }
    }
}
