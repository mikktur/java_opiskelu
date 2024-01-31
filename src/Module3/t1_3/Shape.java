package Module3.t1_3;

public class Shape {
    public double area;
    private String color;
    public Shape(String color){
        area = 0;
        this.color = color;
    }
    public double calculateArea(){
        return area;
    }
    public String getColor() {
        return color;
    }
}
