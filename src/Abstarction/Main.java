package Abstarction;


import static java.lang.Math.PI;

abstract class A {
    public abstract void methodB();

    public abstract void methodC();

    public abstract void methodD();

    public void display() {
        System.out.println("Class A display method");
    }

//    public void print(){
//        System.out.println("I am class A");
//    }
}

//
interface B {
    void methodB();
    void print();
}


interface C extends B {
    void methodC();
    void print();
}


interface D {
    void methodD();
    void print();
}


interface G{
int area();
default void print(){
    System.out.println("The value of pi is" + PI);
}
static double getPI(){
    return  PI;
}

    public static void main(String[] args) {
        System.out.println("The value of pi is" + G.getPI());
    }


}
class F implements G{

    @Override
    public int area() {
        return 0;
    }
}

class E extends A implements D,C {
    @Override
    public void methodB() {

    }

    @Override
    public void methodC() {

    }

    @Override
    public void methodD() {

    }

    @Override
    public void print() {

    }

}


public class Main {
    public static void main(String[] args) {
        E e = new E();
        e.methodB();
        e.methodC();
        e.methodD();
        e.display();
    }
}
