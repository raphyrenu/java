package Damas;

public class Program {
    public static void main(String[] args) {
        Person person = new Person();
        person.getAge();
        person.getFirstName();
        person.getLastName();
        System.out.println(person.print());

        person.setFirstName("Mary");

        Person p2 = new Person("Raphael", "John", 23);

        System.out.println(person.print());

    }
}
