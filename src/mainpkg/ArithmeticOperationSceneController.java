/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author pc
 */
public class ArithmeticOperationSceneController implements Initializable {

    @FXML
    private TextField xTextField;
    @FXML
    private TextField yTextField;
    @FXML
    private Label ResultLabel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addButtonMouseClicked(MouseEvent event) {
        String xstr = xTextField.getText();
        String ystr = yTextField.getText();
        int xval = Integer.parseInt(xstr);
        int yval = Integer.parseInt(ystr);
        int sum = xval+yval;
        String resultStr=Integer.toString(sum);
        ResultLabel.setText(resultStr);
    }

    @FXML
    private void SubtractButtonOnMouseCliked(ActionEvent event) {
        String xstr = xTextField.getText();
        String ystr = yTextField.getText();
        int xval = Integer.parseInt(xstr);
        int yval = Integer.parseInt(ystr);
        int sum = xval-yval;
        String resultStr=Integer.toString(sum);
        ResultLabel.setText(resultStr);
    }

    @FXML
    private void MultiplyButttonOnMouseClicked(ActionEvent event) {
        String xstr = xTextField.getText();
        String ystr = yTextField.getText();
        int xval = Integer.parseInt(xstr);
        int yval = Integer.parseInt(ystr);
        int sum = xval*yval;
        String resultStr=Integer.toString(sum);
        ResultLabel.setText(resultStr);
    }
    
}
