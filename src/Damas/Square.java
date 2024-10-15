package Damas;

public class Square extends Shape {

    public Square(int width, String color) {
        super(width, color);
    }

    @Override
    public String toString() {
        return super.toString()+ " I am Square { "+ " color "+super.getColor()+" width "+super.getColor()+" }";
    }
}
