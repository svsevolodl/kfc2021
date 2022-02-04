package Lesson_2;
import java.util.Scanner;

class Otrezki {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt(), b1 = sc.nextInt();
        int a2 = sc.nextInt(), b2 = sc.nextInt();

        if ((a2-b1)*(b2-a1)<=0) {
            if (a2==b1) {
                System.out.print(a2);
            }else if (b2==a1) {
                System.out.print(b2);
            }
        }else if (a1>=a2 && b1<=b2){
            System.out.print(a1+" "+b1);
        }else if (a2>=a1 && b2<=b1) {
            System.out.print(a2+" "+b2);
        }else if (a1<a2 && a2<b1 && b1<b2) {
            System.out.print(a2+" "+b1);
        }else if (a2<a1 && a1<b2 && b2<b1) {
            System.out.print(a1+" "+b2);
        }else if (a2>b1) {
            System.out.print("Пересечения нет");
        }

    }


}
