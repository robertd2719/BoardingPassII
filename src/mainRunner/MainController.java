package mainRunner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class MainController {

    @FXML
    private Text authenticateMessageField;

    @FXML
    private TextField nameField;

    @FXML
    private PasswordField passField;

    @FXML
    private Button subButton;

    @FXML
    void onSubButtonClick(ActionEvent event) {
        if(nameField.getText().equals("Admin") && passField.getText().equals("Admin")){
            authenticateMessageField.setText("User Authenticated");
        }
    }

}
