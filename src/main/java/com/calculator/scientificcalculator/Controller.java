package com.calculator.scientificcalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;


public class Controller {
    @FXML
    private Label result;

    private double number1=0;

    private double number2=0;

    private String operator="";

    private boolean start=true;

    private Calculator calculator = new Calculator();

    @FXML
    public void processNumber(ActionEvent event){
        if(start){
            result.setText("");
            start=false;
        }
        String value=((Button)event.getSource()).getText();
        result.setText(result.getText()+ value);
    }

    @FXML
    public void processBinaryOperator(ActionEvent event) {
        String value=((Button)event.getSource()).getText();
        if(!value.equals("=")){
            if(!operator.isEmpty())
                return;

            operator = value;
            number1=Double.parseDouble(result.getText());
            result.setText("");
        }else{
            if(operator.isEmpty())
                return;

            number2=Double.parseDouble(result.getText());
            double output=calculator.calculateBinaryNumber(number1, number2, operator);
            result.setText(String.valueOf(output));
            operator="";
        }
    }
    public void processUnaryOperator(ActionEvent event) {

        String value=((Button)event.getSource()).getText();
        if(!operator.isEmpty())
            return;

        operator = value;
        number1=Float.parseFloat(result.getText());
        result.setText("");

        double output=calculator.calculateUnaryNumber(number1,operator);
        result.setText(String.valueOf(output));
        operator="";
    }

    public void ClearFunction(ActionEvent event){
        operator="";
        start=true;
        result.setText("");
    }



}