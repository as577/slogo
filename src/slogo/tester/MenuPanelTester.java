package slogo.tester;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import slogo.view.GraphicsWindow;
import slogo.view.MenuPanel;

public class MenuPanelTester extends Application {

    private static final String STYLESHEET = "application.css";
    private static final int WINDOW_WIDTH = 1280;
    private static final int WINDOW_HEIGHT = 720;
    
    private static final String TITLE = "SLogo | A Simple Logo IDE";
    private static final String LANGUAGE = "English";
    
    @Override
    public void start(Stage primaryStage) {
            try {
                    MenuPanel mp = new MenuPanel(null);
                    Scene scene = new Scene(mp, WINDOW_WIDTH, WINDOW_HEIGHT);

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
