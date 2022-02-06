package Lesson_2;
import java.util.Scanner;

class testFor5_2_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i =1; i<=num; i++) {
            int count = 1;
            for (int j = 1; j<=i; j++) {
                for (int k = 1; k<= j; k++) {
                    if (count<=i) {
                        System.out.print(j);
                        if (count<i) {
                            System.out.print(" ");
                        }
                    }count++;

                }
            }if (i<num) {
                System.out.println("");
            }
        }

    }
}
