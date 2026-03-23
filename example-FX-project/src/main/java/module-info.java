module edu.utsa.cs3443.examplefxproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.utsa.cs3443.examplefxproject to javafx.fxml;
    exports edu.utsa.cs3443.examplefxproject;
}