package Lesson_2;

import java.util.Scanner;
class MyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num>=6) {
            for (int i=1; i <= num; i++) {
                if (i%6==0){
                    System.out.print(i+" ");
                }
            }

        }else {
            System.out.println("Таких чисел нет");
        }




        }

    }
