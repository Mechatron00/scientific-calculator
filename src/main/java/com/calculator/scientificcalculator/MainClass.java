package com.calculator.scientificcalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class MainClass extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Layout.fxml"));
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
//        AnchorPane anchorPane = new AnchorPane();
//        anchorPane.setMinSize(585, 458);
//        anchorPane.setMaxSize(585, 458);
//        anchorPane.setPrefSize(585, 458);
//        anchorPane.setStyle("-fx-background-color: black;");
//
//        Scene scene = new Scene(anchorPane, 585, 458, Color.WHITE);
//
//        primaryStage.setScene(scene);
//        primaryStage.show();




    }

    public static void main(String[] args) {
        launch();
    }
}