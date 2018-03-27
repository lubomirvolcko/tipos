package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    public Button btnLogin;
    public Label lblError;
    public PasswordField txtPassword;
    public TextField txtLogin;

    private void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("mainWindow.fxml"));
        primaryStage.setTitle("admin");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public void clickLogin() throws IOException {
        String login = txtLogin.getText().trim();
        String password = txtPassword.getText().trim();
        System.out.println(login+" "+password);
        if (login.length()<1 || password.length()<1){
            lblError.setText("Wrong login or password!");
        }else {
            Stage stage = (Stage) btnLogin.getScene().getWindow();
            Stage nextStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("mainWindow.fxml"));
            nextStage.setTitle("admin");
            nextStage.setScene(new Scene(root, 600, 275));
            nextStage.show();
            stage.close();
        }

    }


}
