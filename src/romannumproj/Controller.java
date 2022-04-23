/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romannumproj;

import java.awt.event.ActionEvent;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private Button onvertButton;
    @FXML
    private TextField conversionTextField;
    @FXML
    private Label resultLabel;
    @FXML
    private Label alertLabel;

    public static String IntegerToRomanNumeral(int number) {
        StringBuilder br = new StringBuilder("");
        while (number != 0) {
            while (number >= 1000) {
                br.append("M");
                number -= 1000;
            }
            while (number >= 900) {
                br.append("CM");
                number -= 900;
            }
            while (number >= 500) {
                br.append("D");
                number -= 500;
            }
            while (number >= 400) {
                br.append("CD");
                number -= 400;
            }
            while (number >= 100) {
                br.append("C");
                number -= 100;
            }
            while (number >= 90) {
                br.append("XC");
                number -= 90;
            }
            while (number >= 50) {
                br.append("L");
                number -= 50;
            }
            while (number >= 40) {
                br.append("XL");
                number -= 40;
            }
            while (number >= 10) {
                br.append("X");
                number -= 10;
            }
            while (number >= 9) {
                br.append("IX");
                number -= 9;
            }
            while (number >= 5) {
                br.append("V");
                number -= 5;
            }
            while (number >= 4) {
                br.append("IV");
                number -= 4;
            }
            while (number >= 1) {
                br.append("I");
                number -= 1;
            }
        }
        return br.toString();
    }

    @FXML
    void numConversionforTxtField() {
        conversionTextField.textProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(newValue);
            if (!newValue.matches("|[-\\+]?|[-\\+]?\\d+\\.?|[-\\+]?\\d+\\.?\\d+?\\null")) {

                conversionTextField.setText(oldValue);
            } else if(conversionTextField.getText().isEmpty()){
                  resultLabel.setText("Numeral goes here");
            }else {
                int Temp = Integer.parseInt(conversionTextField.getText());
                try {
                    if (Temp > 0 && Temp < 3999) {
                        alertLabel.setVisible(false);
                        String Res = IntegerToRomanNumeral(Temp);
                        System.out.println(Res);
                        resultLabel.setText(Res);
                    } else {
                        alertLabel.setVisible(true);
                        resultLabel.setText(" ");
                    }
                } catch (NumberFormatException exc) {
                    System.out.println(exc);
                } catch (Exception amk) {
                    System.out.println(amk);
                }
            }
        });

    }

}
