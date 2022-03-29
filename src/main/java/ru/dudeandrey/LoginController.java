package ru.dudeandrey;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import ru.dudeandrey.db.SQLiteJDBC;

import java.io.IOException;

public class LoginController {
    SQLiteJDBC sql = new SQLiteJDBC();

    @FXML
    private TextField confFile;
    @FXML
    private TextField dbFile;
    @FXML
    private TextField dbTable;


    @FXML
    private void switchToAppController() throws IOException {
        App.setRoot("anchor-pane-view");
        System.out.println("Switched to the App");
    }

    @FXML
    private void initialize() {
        System.out.println("Login form initialized!");
        //ReadProperties.checkFileProperty();
        confFile.setText(ReadProperties.checkFileProperty());
        dbFile.setText(DBFile.checkDBFile());
        dbTable.setText(sql.connectToSQLite());
        //Platform.runLater(() -> setTime());
        //Platform.runLater(() -> setTime());
    }

    protected void setTime() {
        //time.setText(datetime);
        // или обновим содержимое label из потока, не относящегося к FX application thread.
        // так же можно использовать javafx.concurrent.Task
        //Platform.runLater(() -> time.setText(datetime));
        //Platform.runLater(() -> runTimer());
    }
}
