package org.saatsch.javafx.cheatsheet.model.java;

import javafx.scene.control.TreeItem;

public class Package implements SheetElement{

  private final String name;



  public <E> Package(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }



}
