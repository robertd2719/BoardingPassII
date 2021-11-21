package mainRunner.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Login extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = new FXMLLoader().load(getClass().getResource("LoginFXML.fxml"));
        Scene scene = new Scene(root,600,400);
        stage.setTitle("Please Login");
        stage.setScene(scene);
        stage.show();

    }
}
