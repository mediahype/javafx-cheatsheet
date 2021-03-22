package org.saatsch.javafx.cheatsheet.model.java;

import javafx.scene.control.TreeItem;

public class Demo implements SheetElement {

  private final String name;

  public Demo(String name) {

    this.name = name;

  }

  @Override
  public String getName() {
    return name;
  }
}
