package Module6.t3_1;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class PetGui extends Application {


    private Canvas canvas;
    private Controller controller;
    private GraphicsContext gc;
    @Override
    public void start(Stage primaryStage) throws Exception {
        controller = new Controller(this);

        canvas = new Canvas(1000, 1000);
        gc = canvas.getGraphicsContext2D();
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (!controller.targetReached()) controller.move();


            }
        };
        StackPane root = new StackPane();
        root.getChildren().add(canvas);
        canvas.setOnMouseEntered(e ->{
            timer.start();
        });
        canvas.setOnMouseExited(e->{
            timer.stop();
        });
        canvas.setOnMouseMoved(e->{
            controller.getMouseY(e.getY());
            controller.getMouseX(e.getX());
        });


        Scene scene = new Scene(root, canvas.getWidth(), canvas.getHeight());
        primaryStage.setScene(scene);
        primaryStage.show();



    }

    public void updateCanvas(double petX, double petY) {
        clearCanvas();
        System.out.println("asdsadsad");
        Image petImage = controller.getPetImage();
        //lasketaan imagen keskipiste
        double imageX = petX - petImage.getWidth() / 2;
        double imageY = petY - petImage.getHeight() / 2;

        gc.drawImage(petImage, imageX, imageY);


    }

    public void clearCanvas() {
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }


}
