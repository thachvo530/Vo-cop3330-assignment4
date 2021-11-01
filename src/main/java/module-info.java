module ucf.assignments.assignment4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ucf.assignments.assignment4 to javafx.fxml;
    exports ucf.assignments.assignment4;
}