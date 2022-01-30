package Lesson_2;

public class Person2 {
    private String fullName;
    private int age;
    private int id = 0;
    private static int countObject = 0;

    public Person2(){
        this.id = countObject++;
        count();

    }

    public Person2(String fullName, int age){
        this.age = age;
        this.fullName = fullName;
        this.id = countObject++;
        count();
    }

    public void talk(){
        if (fullName!=null && fullName.equals("") && age!=0){
            if (id == 2){
                System.out.printf("Привет! Я избранный%n", fullName);
            } else {
                System.out.printf("Привет! Я %s и мне %s лет %n", fullName, age);
            }
        }
    }

    public static void count(){
        System.out.printf("Создано %s объектов%n", countObject);
    }
}
