package Module6;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.stage.Stage;

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

        Label convertedDesc = new Label("Converted amount");
        convertedAmount = new TextField();
        convertedAmount.setEditable(false);
        convertedAmount.setPromptText("Converted amount");

        targetCurrency = new ChoiceBox<>();
        targetCurrency.getItems().addAll("USD", "EUR", "GBP", "INR", "AUD", "CAD", "SGD", "CHF", "MYR", "JPY", "CNY");
        targetCurrency.setValue("EUR");

        sourceCurrency = new ChoiceBox<>();
        sourceCurrency.getItems().addAll("USD", "EUR", "GBP", "INR", "AUD", "CAD", "SGD", "CHF", "MYR", "JPY", "CNY");
        sourceCurrency.setValue("EUR");


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

        VBox vbox = new VBox(title, conversionText, choicePane, convert, manualWrapper);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(20));

        layout.setCenter(vbox);


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


        Scene scene = new Scene(layout, 700, 270);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

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


}
