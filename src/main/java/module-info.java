module com.isep.harryp_final_nathanastruc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.isep.visual to javafx.fxml;
    exports com.isep.visual;


}