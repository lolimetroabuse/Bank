module com.example.sberbankoffline2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.sql;
    requires mysql.connector.j;

    opens com.example.sberbankoffline2 to javafx.fxml;
    exports com.example.sberbankoffline2;
}