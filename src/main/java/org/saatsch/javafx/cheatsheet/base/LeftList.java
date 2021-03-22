package org.saatsch.javafx.cheatsheet.base;

import javafx.scene.layout.VBox;


public class LeftList extends VBox {

  public LeftList() {
    getChildren().add(new SheetsTree());
  }


}
