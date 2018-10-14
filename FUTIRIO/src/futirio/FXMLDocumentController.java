/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futirio;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

/**
 *
 * @author Henrique Almeida
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private ImageView bg;
    
    @FXML
    private ImageView logo;

    @FXML
    private Button jogar;

    @FXML
    private Button creditos;
    
    @FXML
    private void jogar(ActionEvent event) {
        System.out.println("You clicked me!");
    }
    
    @FXML
    private void creditos(ActionEvent event) {
        System.out.println("You clicked me!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
