package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {

    public Button btnLogin;
    public Label lblError;
    public PasswordField txtPassword;
    public TextField txtLogin;

    public void clickLogin(){
        String login = txtLogin.getText().trim();
        String password = txtPassword.getText().trim();
        System.out.println(login+" "+password);
        if (login.length()<1 || password.length()<1){
            lblError.setText("Wrong login or password!");
        }else {

        }

    }

}
