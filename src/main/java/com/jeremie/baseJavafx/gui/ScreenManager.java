package com.jeremie.baseJavafx.gui;

import com.jeremie.baseJavafx.constants.Config;
import com.jeremie.baseJavafx.constants.SpringFxmlLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Configuration;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by jeremie on 15/5/8.
 */
@Configuration
public class ScreenManager implements Observer {
    private static Logger logger = LogManager.getLogger(ScreenManager.class);
    private static SpringFxmlLoader loader = new SpringFxmlLoader();


    private Stage stage;
    private Scene scene;

    public void setPrimaryStage(Stage primaryStage) {
        this.stage = primaryStage;
    }

    public void showStage() {
        stage.setTitle("javafx");
        Pane pane = new Pane();
        pane.getChildren().setAll(loader.load("/fxml/main.fxml"));
        scene = new Scene(pane, Config.getWIDTH(), Config.getHEIGHT());
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
