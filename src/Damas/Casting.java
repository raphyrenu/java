package Damas;

public class Casting {
    public static void main(String[] args) {
        short num = 5;
        int a = num;
        System.out.println(a);
        int b = 5;
        //implicit
        short c = (short)b;
        System.out.println(c);
        int p=255;
        long s = p;
        //explicit
        System.out.println(s);
        double d = p;
        System.out.println(d);
    }
}
