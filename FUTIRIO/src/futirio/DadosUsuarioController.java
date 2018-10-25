/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futirio;

import futirio.times.Times;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Henrique Almeida
 */
public class DadosUsuarioController implements Initializable {

    @FXML
    private ComboBox<String> time;

    @FXML
    private Button avancar;

    @FXML
    private Button voltar;
    
    private List<String> times = new ArrayList<>();
    
    private ObservableList<String> obsTimes;
    
    @FXML
    public void goToInicio(ActionEvent event) throws IOException{
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("01Inicial.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(tableViewScene);
        window.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        escolheTime();
    }

    public void escolheTime(){
        Times botafogo = new Times("Botafogo");
        Times flamengo = new Times("Flamengo");
        Times fluminense = new Times("Fluminense");
        Times vasco = new Times("Vasco");
        
        obsTimes = FXCollections.observableArrayList(
        "Option 1",
        "Option 2",
        "Option 3");
        
        time = new ComboBox(obsTimes);
        
        obsTimes = FXCollections.observableArrayList(obsTimes);
        
        time.setItems(obsTimes);
    }    
    
}
