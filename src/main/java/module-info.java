module ru.dudeandrey {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.logging.log4j;
    requires org.apache.httpcomponents.httpcore;
    requires org.apache.httpcomponents.httpclient;
    requires java.sql;
    requires com.google.gson;

    opens ru.dudeandrey to javafx.fxml;
    exports ru.dudeandrey;
}