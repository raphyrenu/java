package Damas;

public class Shape {
    private int width;
    private String color;


    public Shape(int width, String color) {
        this.width = width;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "I am shape"  +
                " width= " + width +
                ", color='" + color + '\'' +
                '}';
    }
}
