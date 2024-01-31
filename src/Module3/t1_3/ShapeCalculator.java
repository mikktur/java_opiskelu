package Module3.t1_3;

public class ShapeCalculator {
    public static void main(String[]args){
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2,"red");
        shapes[1] = new Rectangle(3,"yellow");
        shapes[2] = new Triangle(4,2,"blue");
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea()+" Color: "+shape.getColor());

        }
    }
}
