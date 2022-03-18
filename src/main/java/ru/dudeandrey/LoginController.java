package ru.dudeandrey;

import javafx.fxml.FXML;

import java.io.IOException;

public class LoginController {
    @FXML
    private void switchToAppController() throws IOException {
        App.setRoot("anchor-pane-view");
        System.out.println("Switched to the App");
    }
}
