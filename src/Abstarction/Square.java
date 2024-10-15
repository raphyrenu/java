package Abstarction;

public class Square extends Shape{
    private int side;

    public Square(int side) {
        this.side = side;
    }


    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int square(int side){
        return side* side ;
    }

    @Override
    public double area() {
        return square(side);
    }

    @Override
    public void printArea() {
        System.out.println(area());
    }
}
