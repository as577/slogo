package slogo.tester;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import slogo.view.GraphicsWindow;

public class GraphicsWindowTester extends Application {

    private static final String STYLESHEET = "application.css";
    private static final int WINDOW_WIDTH = 1280;
    private static final int WINDOW_HEIGHT = 720;
    
    private static final String TITLE = "SLogo | A Simple Logo IDE";
    private static final String LANGUAGE = "English";
    
    @Override
    public void start(Stage primaryStage) {
            try {
                    GraphicsWindow gw = null;
                    Scene scene = new Scene(gw, WINDOW_WIDTH, WINDOW_HEIGHT);

                    primaryStage.setTitle(TITLE);
                    primaryStage.setScene(scene);
                    primaryStage.show();
            } catch(Exception e) {
                    e.printStackTrace();
            }
    }
    
    public static void main(String[] args) {
            launch(args);
    }

}
