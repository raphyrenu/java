package Damas;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private int age;


    public Person( String firstName, String lastName, int age){
        this.age=age;
        this.firstName=firstName;

        this.lastName=lastName;


    }
 final public void printn(){
    System.out.println("I am student");
}
    public Person(int id, String firstName, String lastName, int age){
        this.age=age;
        this.firstName=firstName;
        this.id=id;
        this.lastName=lastName;


    }

    public Person() {

    }

    public String print(){
        return "I am "+ firstName+" I am "+ age;
    }

    public static void main(String[] args) {

Person person = new Person(21,"Raphael","Nibishaka",20);
        System.out.println(person.print());


    }




    public int setId(int identity){
        return this.id=identity;
    }

    public int getId(){
        return id;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
