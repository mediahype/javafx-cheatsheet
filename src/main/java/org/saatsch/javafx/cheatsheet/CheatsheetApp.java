package org.saatsch.javafx.cheatsheet;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheatsheetApp extends Application {


  @Override
  public void start(Stage stage) throws Exception {

    VBox root = new VBox();

    Scene scene = new Scene(root, 800, 600);

    stage.setScene(scene);

    stage.show();

  }
}
