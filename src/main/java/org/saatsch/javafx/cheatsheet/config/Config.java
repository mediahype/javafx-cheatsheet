package org.saatsch.javafx.cheatsheet.config;

import javafx.scene.control.TreeItem;
import org.saatsch.javafx.cheatsheet.model.java.Demo;
import org.saatsch.javafx.cheatsheet.model.java.Package;
import org.saatsch.javafx.cheatsheet.model.java.SheetElement;

public class Config {

  public static TreeItem<SheetElement> createConfig(){

    System.out.println("creating config...");

    TreeItem<SheetElement> ret = new TreeItem<>(new Package("root"));
    TreeItem<SheetElement> demoPackage1 = new TreeItem<>(new Package("demoPackage1"));
    ret.getChildren().add(demoPackage1);

    demoPackage1.getChildren().add(new TreeItem<>(new Demo("demo1")));

    return ret;


  }

}
