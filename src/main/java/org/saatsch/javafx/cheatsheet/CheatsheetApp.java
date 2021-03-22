package org.saatsch.javafx.cheatsheet;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CheatsheetApp extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {

    CheatSheetC root = new CheatSheetC();
    primaryStage.setScene( new Scene(root, 800, 600));
    primaryStage.show();

  }
}
