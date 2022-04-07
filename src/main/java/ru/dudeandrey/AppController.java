package ru.dudeandrey;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import ru.dudeandrey.db.DBApp;
import ru.dudeandrey.jsonworker.RequestHTTPGetv2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;

import static ru.dudeandrey.MyTimerTask.runTimer;
import static ru.dudeandrey.RequestHTTPGet.requestHTTPGet;

public class AppController {
    //SQLiteJDBC sql = new SQLiteJDBC();
    DBApp dba = new DBApp();
    RequestHTTPGetv2 rhtg = new RequestHTTPGetv2();

    @FXML
    private Label time;

    @FXML
    private TextField gbp;
    @FXML
    private TextField usd;
    @FXML
    private TextField chf;
    @FXML
    private TextField cny;
    @FXML
    private TextField rub;

    @FXML
    protected void onGBPButtonClick() {
        gbp.setText("GBP!");
        //requestHTTPGet();
        rhtg.requestHTTPGetv2();
    }

    @FXML
    protected void onUSDButtonClick() {
        usd.setText("USD!");
        //ReadProperties.writeProperties();
        //ReadProperties.loadProperties();
        ReadProperties.loadProperty("API_KEY");
    }

    @FXML
    protected void onCHFButtonClick() {
        chf.setText("CHF!");
        dba.dbapp();
    }

    @FXML
    protected void onCNYButtonClick() {
        cny.setText("CNY!");
    }

    @FXML
    protected void onRUBButtonClick() {
        rub.setText("RUB!");
    }

    @FXML
    //String datetime = String.valueOf(Calendar.getInstance().getTime());
    String datetime = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());

    protected void setTime() {
        //time.setText(datetime);
        // или обновим содержимое label из потока, не относящегося к FX application thread.
        // так же можно использовать javafx.concurrent.Task
        Platform.runLater(() -> time.setText(datetime));
        //Platform.runLater(() -> runTimer());
    }

    @FXML
    private void initialize() {
        System.out.println("Initialization AppController...");
        Platform.runLater(() -> setTime());
        System.out.println("AppController Initialized!");
    }

    @FXML
    private void updateNotes() {

    }
}
