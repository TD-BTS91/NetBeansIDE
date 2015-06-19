/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Dimitrios
 */
public class JavaFXApplication4 extends Application {

    @Override
    public void start(Stage primaryStage) {
        // ASSOCIE LES FICHIERS DE PROPERTIES PREMIERE PHASE DE TEST

        String s;
        MyProps tmp = new MyProps("MyProperties.properties");
        try {
            s = tmp.getMyProps("LISTEFICHIERS");
            System.out.println("Mes FichiersProperties: " + s);
            String[] ms = s.split(";");
        } catch (NullPointerException npe) {
            System.out.println("NulPointerException");
        }

        // INSTANCIATION DE CLASSES SE SERVANTS DES FICHIERS PROPEIETES PREMIERE PHASE DE TEST
        AttackTower t1 = new AttackTower("Tower1");
        Mob m1 = new Mob("Mob1");

        Button btn = new Button();
        Chemin ch = new Chemin();

        btn.setText("'MOUHOUHAHAHAAHA'");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        StackPane root = new StackPane();
        root.getChildren().addAll(btn);
        root.getChildren().contains(ch);
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
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
