package Module6.t2_1.view;

import Module6.t2_1.controller.Controller;
import javafx.application.Platform;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class CurrencyConvView extends Application {
    private Controller controller;
    private TextField amount;
    private TextField convertedAmount;
    private ChoiceBox<String> sourceCurrency;
    private ChoiceBox<String> targetCurrency;
    Label title;


    public CurrencyConvView() {
        controller = new Controller(this);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane layout = new BorderPane();
        primaryStage.setTitle("Currency Converter");



        title = new Label("Currency Converter");
        title.getStyleClass().add("title");

        Button convert = new Button("Convert");
        convert.getStyleClass().add("button");

        Label manualText = new Label("Enter the amount, select the source and target currency," +
                " after that press the convert button");

        Label amountDesc = new Label("Amount");
        amount = new TextField();
        amount.setPromptText("Enter amount");
        //sallitaan vain numerot ja yksi desimaalipiste.
        amount.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*(\\.\\d*)?")) {
                amount.setText(oldValue);
            }
        });

        Label convertedDesc = new Label("Converted amount");
        convertedAmount = new TextField();
        convertedAmount.setEditable(false);
        convertedAmount.setPromptText("Converted amount");

        targetCurrency = new ChoiceBox<>();


        sourceCurrency = new ChoiceBox<>();

        controller.setChoiceBoxItems();

        GridPane conversionText = new GridPane();
        conversionText.getStyleClass().add("conversionText");
        conversionText.add(title, 0, 0, 2, 1);
        conversionText.add(amountDesc, 0, 1);
        conversionText.add(amount, 1, 1);
        conversionText.add(convertedDesc, 0, 2);
        conversionText.add(convertedAmount, 1, 2);
        conversionText.setAlignment(Pos.CENTER);
        conversionText.setHgap(10);
        conversionText.setVgap(10);
        ColumnConstraints col1 = new ColumnConstraints();
        col1.setHalignment(HPos.RIGHT);
        conversionText.getColumnConstraints().add(col1);


        Label fromText = new Label("source");
        Label toText = new Label("target");

        GridPane choicePane = new GridPane();
        choicePane.getStyleClass().add("choicePane");
        choicePane.add(sourceCurrency, 0, 1);
        choicePane.add(targetCurrency, 2, 1);
        GridPane.setHalignment(fromText, HPos.CENTER);
        choicePane.add(fromText, 0, 0);
        choicePane.add(toText, 2, 0);
        GridPane.setHalignment(toText, HPos.CENTER);
        choicePane.setAlignment(Pos.CENTER);
        choicePane.setHgap(50);
        choicePane.setVgap(2);

        VBox manualWrapper = new VBox(manualText);
        manualWrapper.setAlignment(Pos.CENTER);
        manualWrapper.setPadding(new Insets(20, 0, 5, 0));

        //Start of addCurrency task
        Button addCurrency = new Button("Add currency");
        addCurrency.getStyleClass().add("button");
        addCurrency.setOnAction(event -> {
            Stage newStage = new Stage();
            VBox addCurrencyBox = new VBox();

            newStage.setTitle("Add currency");
            Label nimi = new Label("Currency name");
            TextField nimiField = new TextField();
            nimiField.setTextFormatter(createTextFormatter(20));
            Label abbreviation = new Label("Currency abbreviation");
            TextField abbreviationField = new TextField();

            //varmistetaan, että syötetty teksti on kirjaimia
            abbreviationField.textProperty().addListener((observable, oldValue, newValue) -> {
                if (!newValue.matches("[A-Za-z]*")) {
                    abbreviationField.setText(newValue.replaceAll("[^A-Za-z]", ""));
                }
            });
            //muutetaan syötetty teksti isoksi
            abbreviationField.textProperty().addListener((observable, oldValue, newValue) -> {
                abbreviationField.setText(newValue.toUpperCase());
            });

            abbreviationField.setTextFormatter(createTextFormatter(3));
            Label conversionRate = new Label("Conversion rate");

            TextField conversionRateField = new TextField();

            //pakotetaan syötetty teksti olemaan numeroita.
            conversionRateField.textProperty().addListener((observable, oldValue, newValue) -> {
                if (!newValue.matches("\\d*(\\.\\d*)?") || newValue.indexOf('.') != newValue.lastIndexOf('.')) {
                    conversionRateField.setText(oldValue);
                }
            });

            conversionRateField.setTextFormatter(createTextFormatter(10));

            Button cancel = new Button("Cancel");
            cancel.getStyleClass().add("button");
            Button save = new Button("Save");
            save.getStyleClass().add("button");

            cancel.setOnAction(event1 -> newStage.close());

            addCurrencyBox.getChildren().addAll(nimi, nimiField, abbreviation, abbreviationField, conversionRate,
                    conversionRateField, save, cancel);
            addCurrencyBox.setSpacing(10);
            addCurrencyBox.setPadding(new Insets(20));
            addCurrencyBox.setAlignment(Pos.CENTER);

            save.setOnAction(event1 -> {
                try {
                    if (abbreviationField.getText().isEmpty() || nimiField.getText().isEmpty() || conversionRateField.getText().isEmpty()) {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText("Empty fields");
                    alert.setContentText("Please fill all the fields");
                    alert.showAndWait();
                    return;
                }
                try{
                    Double.parseDouble(conversionRateField.getText());
                } catch (NumberFormatException e) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText("Invalid conversion rate");
                    alert.setContentText("Please enter a valid conversion rate");
                    alert.showAndWait();
                    return;
                    //vähän turhaa ehkä, mutta halusin varmistaa.
                }
                controller.addCurrency(abbreviationField.getText(), nimiField.getText(),
                        Double.parseDouble(conversionRateField.getText()));
                sourceCurrency.getItems().add(abbreviationField.getText());
                targetCurrency.getItems().add(abbreviationField.getText());

                newStage.close();
            });

            BorderPane newLayout = new BorderPane();
            newLayout.setPadding(new Insets(20));
            Scene newScene = new Scene(newLayout, 300, 400);
            newScene.getStylesheets().add("main/java/Module6/style.css");
            newStage.setScene(newScene);
            newLayout.setCenter(addCurrencyBox);
            newStage.show();
        });

        VBox vbox = new VBox(title, conversionText, choicePane, convert, manualWrapper);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(20));


        layout.setCenter(vbox);

        layout.setLeft(addCurrency);
        BorderPane.setMargin(addCurrency, new Insets(20, 0, 0, 20));


        convert.setOnAction(event -> {
            if (amount.getText().isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("Amount is empty");
                alert.setContentText("Please enter an amount");
                alert.showAndWait();
                return;
            }
            controller.setConvertedAmount(Double.parseDouble(amount.getText()), sourceCurrency.getValue(), targetCurrency.getValue());

        });


        Scene scene = new Scene(layout, 800, 270);
        scene.getStylesheets().add("main/java/Module6/style.css");

        primaryStage.setScene(scene);
        convert.requestFocus();
        primaryStage.show();


    }

    @Override
    public void init() {
        controller = new Controller(this);
    }

    public void setConvertedAmount(double amount) {
        convertedAmount.setText(String.valueOf(amount));
    }

    //formatteri jolla rajoitetaan tekstikentän pituus
    public TextFormatter<String> createTextFormatter(int maxLength) {
        return new TextFormatter<>(change -> {
            if (change.isDeleted() || change.isContentChange()) {
                if (change.getControlNewText().length() <= maxLength) {
                    return change;
                }
            }

            return null;
        });
    }

    public void setNoConErrorMessage() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("Database connection failed");
        alert.setContentText("Please check your database connection");
        alert.showAndWait();
        Platform.exit();
    }

    public void setDuplicateErrorMessage() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("Currency already exists");
        alert.setContentText("Please enter a new currency");
        alert.showAndWait();
    }

    public void setChoiceBoxItems(List<String> currencyAbbreviations) {
        sourceCurrency.getItems().addAll(currencyAbbreviations);
        targetCurrency.getItems().addAll(currencyAbbreviations);
        targetCurrency.setValue("USD");
        sourceCurrency.setValue("USD");
    }
}
