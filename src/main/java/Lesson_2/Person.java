package Lesson_2;

public class Person {
    public String fullName;
    public int age;
    public int id = 0;

    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getFullName() {
        return fullName;
    }
    public int getAge() {
        return age;
    }


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }




}
