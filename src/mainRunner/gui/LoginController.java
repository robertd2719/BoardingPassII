package mainRunner.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

   @FXML
   private Label accessLabel;

    @FXML
    private TextField nameField;

    @FXML
    private PasswordField passField;

    @FXML
    private Button subButton;

    @FXML
    public void onSubButtonClick(ActionEvent event) {
        System.out.println(nameField.getText());
        System.out.println(passField.getText());
        if (nameField.getText().equals("admin") && passField.getText().equals("admin")) {
            accessLabel.setText("User Authenticated!!!!");

        } else {
            accessLabel.setText("Invalid Credentials!!!");

        }
        nameField.setText("");
        passField.setText("");
    }

}
