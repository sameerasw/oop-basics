public class Person {
    private String name;
    private String surname;
    private int age;

    //constructor
    public Person(String name) {
        this.name = name;
    }

    public void displayName() {
        System.out.println("Name: " + name);
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
}
