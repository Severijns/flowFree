/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowfree;

import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author GESE
 */
public class View extends Pane{
public View (){
    getChildren().clear();
    int j=0;
        while(j<10){  
            int i = 0;
            while(i<10){
                Rectangle r = new Rectangle(i*51+5,j*51 + 5 , 50, 50);
                r.setFill(Color.BLACK);
                r.setOnMouseEntered((MouseEvent e) -> {
                    //if(e.isPrimaryButtonDown()) {
                        r.setFill(Color.GREEN);
                    //}
                });
                getChildren().add(r);
                i=i+1;
    }
            j=j+1;
        }
   }   

    public void move(){
    Rectangle r = new Rectangle(5, 5, 50, 50);
    r.setFill(Color.RED);
    getChildren().add(r);
    }
}
