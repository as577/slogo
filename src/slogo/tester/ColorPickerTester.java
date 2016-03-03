package slogo.tester;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import slogo.view.ColorPickerStage;
import slogo.view.GraphicsWindow;

public class ColorPickerTester extends Application {

    @Override
    public void start (Stage primaryStage) throws Exception {

        ColorPicker colorPicker = new ColorPicker();
        BorderPane root = new BorderPane();
        root.setCenter(colorPicker);
        
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        

    }
    
    public static void main (String[] args){
        launch(args);
    }

}
