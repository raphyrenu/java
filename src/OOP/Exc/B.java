package OOP.Exc;

public class B extends A{
    public B() {
        super();
    }


    public void String() {
        super.hello(toString());
    }

    @Override
    public String toString() {
        return "B{Message : B}";
    }
}
