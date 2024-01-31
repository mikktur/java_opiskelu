package Module3.t1_3;

public class Rectangle extends Shape {
    private double side;

    public Rectangle(double side,String color) {
        super(color);
        this.side = side;
    }

    public double calculateArea() {
        area = side * side;
        return area;
    }

}
