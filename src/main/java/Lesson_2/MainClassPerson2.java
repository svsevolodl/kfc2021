package Lesson_2;

public class MainClassPerson2 {

    public static void main(String[] args) {
        Person2 Vasia = new Person2();
        Person2 Maria = new Person2("Maria", 20);
        Person2 Ivan = new Person2("Ivan", 22);
        Person2 Alice = new Person2("Alice", 6);
        Person2 Alle = new Person2("Alle", 26);
        Vasia.talk();
        Maria.talk();
        Ivan.talk();
        Alice.talk();
        Alle.talk();
    }
}
