package mainRunner.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MainInterface extends Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage stage) throws Exception {
        //insert main scene information here.
        Parent root = new FXMLLoader().load(getClass().getResource("mainInterfaceFXML.fxml"));
        stage.setScene(new Scene(root,600,400, Color.BISQUE));
        stage.show();
    }
}
