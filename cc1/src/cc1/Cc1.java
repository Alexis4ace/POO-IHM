/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc1;

import java.awt.event.MouseEvent;
import javafx.application.Application;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import static javafx.scene.input.DataFormat.URL;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.event.ChangeListener;

/**
 *
 * @author abottin
 */
public class Cc1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Pane root = new Pane();
        MonSliderInerte slider1 = new MonSliderInerte(root,50,200);
        root.getChildren().add(slider1);
        Scene scene = new Scene(root, 300, 250);
        
        
        
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
