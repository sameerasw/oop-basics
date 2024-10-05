//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Person p = new Person("John");
        p.displayName();

        Person p2 = new Person("Jane");
        Person p3 = new Person("Doe");
        Person p4 = new Person("Smith");

        p2.setSurname("Doe");
        p2.setAge(30);

        p3.setSurname("Smith");
        p3.setAge(40);

        p4.setSurname("Doe");
        p4.setAge(50);

        System.out.println("Name: " + p2.getSurname() + ", Age: " + p2.getAge());
        System.out.println("Name: " + p3.getSurname() + ", Age: " + p3.getAge());
        System.out.println("Name: " + p4.getSurname() + ", Age: " + p4.getAge());
    }
}