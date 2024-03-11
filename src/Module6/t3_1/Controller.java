package Module6.t3_1;


import javafx.scene.image.Image;

public class Controller {

    private PetGui gui;
    private Pet pet;

    public Controller(PetGui gui) {
        this.gui = gui;
        this.pet = new Pet();
    }

    public Image getPetImage(){
        return pet.getPetImage();
    }
    public void setMouseOn(){
        pet.mouseUpdate();
    }
    public void getMouseY(double y){
        pet.setTargetY(y);
    }
    public void move(){
        pet.move();
        gui.updateCanvas(pet.getX(),pet.getY());
    }
    public void getMouseX(double x){
        pet.setTargetX(x);
    }
}
