/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowfree;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author GESE
 */
public class FXMLFlowBoardController {
    
    private View view;
    private Model model;
    
    @FXML
    private AnchorPane pane;
    
    @FXML
    private Button btnlvl1;

    @FXML
    private Button btnlvl2;

    @FXML
    private Button btnlvl3;

    @FXML
    private Button btnlvl4;
    
    public void initialize() {
        view = new View();
        model = new Model(view);
        
        pane.getChildren().add(view);
        model.goToLevel(0);
        //view.setOnKeyPressed(this::move);
        view.setFocusTraversable(true);
        view.requestFocus();
        btnlvl1.setOnAction(evt -> model.goToLevel(0));
        btnlvl2.setOnAction(evt -> model.goToLevel(1));
       
    }    
    /*private void move(){
        view.viewlvl1();
    }
        
    private void level2(){
        view.viewlvl2();
    }*/
}
