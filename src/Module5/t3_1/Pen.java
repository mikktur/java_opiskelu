package Module5.t3_1;

public class Pen {
    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;
        Color(String color) { this.color = color; };
        @Override public String toString() { return color; }
    }
    private Color color;
    private boolean cap;
    public Pen(Color color){
        this.color = color;
        this.cap = true;
    }
    public Pen(){
        this.color = Color.RED;
        this.cap = true;
    }

    // your code here
    public String draw(){
        if(!cap){
            return "Drawing " + color;
        } else return "";
    }
    public void capOff(){
        this.cap = false;
    }
    public void capOn(){
        this.cap = true;
    }
    public void changeColor(Color color){
        this.color = color;
    }
}