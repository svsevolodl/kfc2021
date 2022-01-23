package Lesson_2;

public class MainClassPerson {

    public static void main(String[] args) {
        Person person1 = new Person("Vasia", 12);
        Person person2 = new Person("Masha", 22);
        Person person3 = new Person();
        Person person4 = new Person("Alice", 6);


        System.out.println(person1.getAge());
        System.out.println(person2.getFullName());
        System.out.println("Ничего, если имя и возраст не заданы");
    }
}
