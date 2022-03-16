module ru.dudeandrey {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.logging.log4j;

    opens ru.dudeandrey to javafx.fxml;
    exports ru.dudeandrey;
}