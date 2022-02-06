package Lesson_2;

class testMath5_3_2 {
    public static void main(String[] args) {
        double e = Math.pow(Math.E, Math.PI);
        double p = Math.pow(Math.PI, Math.E);
        System.out.println( e > p ? ">" : e < p ? "<" : "=");
    }
}
