package Module6.t3_1;

import javafx.scene.image.Image;



public class Pet {
    double x;
    double y;
    double targetY;
    double targetX;
    boolean mouseOn = false;
    private Image petImage;


    public Pet() {

        this.petImage = new Image("Module6/t3_1/resources/rat.jpg", 90, 150, true, false);
        this.x = 500;
        this.y = 500;

    }

    public void move() {
        if (mouseOn) {
            double dx = targetX - x;
            double dy = targetY - y;

            //lasketaan etäisyys koordinaattien välillä
            double distance = Math.sqrt(dx * dx + dy * dy);


            if (distance > 0) {
                //normalisoidaan suuntavektorit, jotta vauhti ei ole riippuvainen etäisyydestä.
                dx /= distance;
                dy /= distance;
            }


            double speed = 2;
            x += dx * speed;
            y += dy * speed;
        }


    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


    public Image getPetImage() {
        return this.petImage;
    }

    public void mouseUpdate() {
        mouseOn = !mouseOn;
    }

    public void setTargetY(double y) {
        this.targetY = y;
    }

    public void setTargetX(double x) {
        this.targetX = x;
    }
}


