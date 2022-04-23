/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romannumproj;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.ImageIcon;

/**
 *
 * @author Hp
 */
public class RomanNumProj extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent main = FXMLLoader.load(getClass().getResource("theSample.fxml"));
            Scene mainScene = new Scene(main);
            primaryStage.setScene(mainScene);
//            primaryStage.setWidth(1786);
//            primaryStage.setHeight(1200);
            primaryStage.setResizable(false);
            primaryStage.show();
//            primaryStage.setIconified(true);
            primaryStage.addEventHandler(KeyEvent.KEY_RELEASED, (KeyEvent event) -> {
                if (KeyCode.ESCAPE == event.getCode()) {
                    primaryStage.close();
                }
            });
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
