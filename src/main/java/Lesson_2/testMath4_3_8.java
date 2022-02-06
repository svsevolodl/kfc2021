package Lesson_2;
import java.text.DecimalFormat;
import java.util.Scanner;

class testMath4_3_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Math.abs(sc.nextInt()), y = Math.abs(sc.nextInt()), n = Math.abs(sc.nextInt());
        double kor = (Math.pow(Math.pow(x,y),1.0/n));
        DecimalFormat df = new DecimalFormat("#.0####");
        System.out.println(df.format(kor));
    }
}
