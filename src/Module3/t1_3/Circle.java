package Module3.t1_3;

public class Circle extends Shape{
    private double radius;
    public Circle(double radius,String color){
        super(color);
        this.radius = radius;
    }

    public double calculateArea(){
        area = radius*2*3.14;
        return area;
    }
}
