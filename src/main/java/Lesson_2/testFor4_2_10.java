package Lesson_2;
import java.util.Scanner;

class testFor4_2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int id = 0;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j<=i; j++) {
                if (i==j) {
                    for (int k= 0; k<j; k++) {
                        id++;
                        if (id<=num) {
                            System.out.print(j+" ");
                        }
                    }
                }
            }
        }
    }
}
