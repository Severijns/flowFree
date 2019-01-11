/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowfree;

import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author GESE
 */
public class View extends Pane{
    public View () {

    }

    public void draw(Level level) {
        int size = level.getSizeGrid();
        
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                Rectangle r = new Rectangle(x*51+5, y*51+5, 50, 50);
                r.setFill(Color.BLACK);
                getChildren().add(r);
            }
        }
        
        for (int i = 0; i < level.getCombinations().size(); i++) {
            Combination comb = level.getCombinations().get(i);
            Circle c1 = new Circle(30+comb.getX1()*51, 30+comb.getY1()*51, 20);
            c1.setFill(Color.RED);
            Circle c2 = new Circle(30+comb.getX2()*51, 30+comb.getY2()*51, 20);
            c2.setFill(Color.RED);
            getChildren().addAll(c1, c2);
        }
        
    }
}
