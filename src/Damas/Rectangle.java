package Damas;

public class Rectangle extends Shape{
    private int height;


    public Rectangle(int width, String color, int height) {
        super(width, color);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString()+ " I am Rectangle{" +
                "height=" + height +
                "color"+ super.getColor() + "width"+ super.getWidth() +
                '}';
    }
}
