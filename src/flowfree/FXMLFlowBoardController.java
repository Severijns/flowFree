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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

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
    
    @FXML
    private AnchorPane panestart;

    @FXML
    private Button btnstart;
    
    @FXML
    private Label lblintro;
    
    @FXML
    private ImageView image;


    
    public void initialize() {
    //    BorderPane panestart = new BorderPane();
        image = new ImageView("/flowfree/fotoflow.png");
   //     panestart.setCenter(image);
        update();
        
        
        panestart.getChildren().add(image);
        
        btnlvl1.setVisible(false);
        btnlvl2.setVisible(false);
        btnlvl3.setVisible(false);
        btnlvl4.setVisible(false);
        
        lblintro.setVisible(false);
               
        btnlvl1.setOnAction(evt -> model.goToLevel(0));
        btnlvl2.setOnAction(evt -> model.goToLevel(1));
        btnstart.setOnAction(evt -> start());

    }   
    
    public void update(){
    image.setX(95);
    image.setY(120);
        
    }
    
    private void start(){
        view = new View();
        view.setFocusTraversable(true);
        view.requestFocus();
        model = new Model(view);
        
        pane.getChildren().add(view);
        model.goToLevel(0);
        
        
        btnlvl1.setVisible(true);
        btnlvl2.setVisible(true);
        btnlvl3.setVisible(true);
        btnlvl4.setVisible(true);
        
        lblintro.setVisible(true);
        
        btnstart.setVisible(false);
        
        image.setVisible(false);
    }
}
