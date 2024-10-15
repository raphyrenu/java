package OOP.Exc;

public class A {
    private String message;

    public A() {
        this.message = message;
    }


    public void hello(Object arg){

        System.out.println(arg);


    }

    public static void main(String[] args) {

    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "A{" +
                "message='" + "A" + '\'' +
                '}';
    }
}
