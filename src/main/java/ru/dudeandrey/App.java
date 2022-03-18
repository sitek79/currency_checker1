package ru.dudeandrey;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * JavaFX App
 */
public class App extends Application {

    static final Logger rootLogger = LogManager.getRootLogger();
    static final Logger userLogger = LogManager.getLogger(App.class);

    @Override
    public void init() {
        String name = Thread.currentThread().getName();
        System.out.println("init() method: " + name);
    }

    @Override
    public void start(Stage stage) throws IOException {
        //
        rootLogger.info("Root Logger:");
        rootLogger.debug("RootLogger: In debug message");
        rootLogger.error("ERROR");
        //
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("anchor-pane-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() {
        String name = Thread.currentThread().getName();
        System.out.println("stop() method: " + name);
    }

    public static void main(String[] args) {
        launch();
    }
}