package Module5.t1_1;

import javafx.geometry.Pos;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.EventHandler;


import javafx.geometry.Insets;


public class DictionaryView extends Application {
    public DictionaryView() {
    }


    private DictionaryController controller;


    @Override
    public void start(Stage stage) {
        Button getTranslation = new Button("Get Translation");
        TextArea word = new TextArea();
        Label translation = new Label();
        word.setPrefSize(50, 50);


        stage.setTitle("Dictionary");
        VBox vbox = new VBox(translation, word, getTranslation);

        Insets insets = new Insets(10, 10, 10, 10);
        vbox.setPadding(insets);
        vbox.setSpacing(10);
        vbox.setAlignment(Pos.CENTER);

        word.addEventFilter(KeyEvent.KEY_PRESSED, event -> {
            if (event.getCode() == KeyCode.ENTER) {
                event.consume();
                getTranslation.fire();
            }
        });


        getTranslation.setOnAction(event -> {
            translation.setText(controller.getTranslation(word.getText()));
            word.clear();

        });


        Scene scene = new Scene(vbox, 300, 250);
        stage.setScene(scene);
        stage.show();

    }

    @Override
    public void init() {
        controller = new DictionaryController(this);
    }


    public void addWord(String word, String translation) {
        controller.addWord(word, translation);
    }


}

