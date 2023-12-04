package com.example.fx;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Login extends Application implements EventHandler<ActionEvent> {
    private static final String VALID_USERNAME = "abdullah";
    private static final String VALID_PASSWORD = "1234567";
    private TextField textField;
    private  PasswordField passwordField;

    public static void main(String[] arg) {
        launch(arg);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFx");
        Text welcomeText = new Text("Welcome to our Store");
        welcomeText.setFont(Font.font("Helvetica", 30));
        welcomeText.setFill(Color.BLACK);
        Label usernameLabel = new Label("Username");
        usernameLabel.setFont(Font.font("",15));
        textField = new TextField();
        Label passwordLabel = new Label("Password");
        passwordLabel.setFont(Font.font("",15));
         passwordField = new PasswordField();
        Button loginButton = new Button("Login");
        loginButton.setStyle("-fx-background-color: black; -fx-text-fill: white; -fx-font-size: 14px; -fx-padding: 10px 15px;");
        loginButton.setOnAction(this);
        GridPane layout = new GridPane();
        layout.add(welcomeText, 0, 0, 2, 1);
        layout.add(usernameLabel, 0, 1);
        layout.add(textField, 1, 1);
        layout.add(passwordLabel, 0, 2);
        layout.add(passwordField, 1, 2);
        layout.add(loginButton, 1, 3, 2, 1);
        layout.setHgap(10);
        layout.setVgap(10);
        Scene scene = new Scene(layout, 400, 500);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        Image image = new Image(getClass().getResourceAsStream("logo.png"));
        primaryStage.getIcons().add(image);
        primaryStage.show();
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        String enteredUsername = textField.getText();
        String enteredPassword = passwordField.getText();
        if (enteredUsername.equalsIgnoreCase(VALID_USERNAME) && enteredPassword.equalsIgnoreCase(VALID_PASSWORD)) {
            System.out.println("Login Successful");
            ((Stage) textField.getScene().getWindow()).close();
            Productdisplay productdisplay=new Productdisplay();
            Userinteraction userinteraction= new Userinteraction();
            userinteraction.productMap.put(1, new Product("Luxury Watch 1", 1, 1000));
            userinteraction.productMap.put(2, new Product("Sports Watch 1", 2, 800));
            userinteraction.productMap.put(3, new Product("Casual Watch 1", 3, 500));
            userinteraction.productMap.put(4, new Product("Digital Watch 1", 4, 600));
            userinteraction.productMap.put(5, new Product("Smartwatch 1", 5, 700));
            userinteraction.productMap.put(6, new Product("Classic Watch 1", 6, 800));
            userinteraction.productMap.put(7, new Product("Fashion Watch 1", 7, 900));
            userinteraction.productMap.put(8, new Product("Dive Watch 1", 8, 1000));
            userinteraction.productMap.put(9, new Product("Luxury Watch 2", 9, 1200));
            userinteraction.productMap.put(10, new Product("Sports Watch 2", 10, 900));
            userinteraction.productMap.put(11, new Product("Casual Watch 2", 11, 700));
            userinteraction.productMap.put(12, new Product("Digital Watch 2", 12, 800));
            userinteraction.productMap.put(13, new Product("Smartwatch 2", 13, 1000));
            userinteraction.productMap.put(14, new Product("Classic Watch 2", 14, 1100));
            userinteraction.productMap.put(15, new Product("Fashion Watch 2", 15, 1200));
            userinteraction.productMap.put(16, new Product("Dive Watch 2", 16, 1300));
            userinteraction.productMap.put(17, new Product("Luxury Watch 3", 17, 1400));
            userinteraction.productMap.put(18, new Product("Sports Watch 3", 18, 1500));
            userinteraction.productMap.put(19, new Product("Casual Watch 3", 19, 1600));
            userinteraction.productMap.put(20, new Product("Digital Watch 3", 20, 1700));
            Product product;
            for (Product element : userinteraction.productMap.values()) {
                System.out.println(element);
            }
            Checkout checkout=new Checkout(",","","");
            userinteraction.carting();
            userinteraction.totalbill();
            try {
                checkout.order();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            double x=userinteraction.calculateTotalPrice();
            System.out.println("Total Bill="+x);
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }
    }