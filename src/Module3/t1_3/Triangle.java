package Module3.t1_3;

public class Triangle extends Shape{
    private double base;
    private double height;
    public Triangle(double base,double height,String color){
        super(color);
        this.base = base;
        this.height = height;

    }
    public double calculateArea(){
        area = 0.5*base*height;
        return area;
    }
}
