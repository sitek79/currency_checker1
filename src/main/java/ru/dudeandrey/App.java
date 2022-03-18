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
    public App() {
        String name = Thread.currentThread().getName();
        System.out.println("App() constructor: " + name);
    }

    static final Logger rootLogger = LogManager.getRootLogger();
    static final Logger userLogger = LogManager.getLogger(App.class);

    private static Scene scene;

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
        //FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("anchor-pane-view.fxml"));
        //scene = new Scene(fxmlLoader.load(), 600, 400);
        scene = new Scene(loadFXML("primary"), 600, 400);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() {
        String name = Thread.currentThread().getName();
        System.out.println("stop() method: " + name);
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
}