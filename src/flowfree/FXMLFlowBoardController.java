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
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author GESE
 */
public class FXMLFlowBoardController {
    
    private View view;
    
    @FXML
    private AnchorPane pane;
    
    public void initialize() {
        view = new View();
        pane.getChildren().add(view);
        view.setOnKeyPressed(this::move);
        view.setFocusTraversable(true);
        view.requestFocus();
       
    }    
    public void move(KeyEvent e){
        view.move();
    }
}
