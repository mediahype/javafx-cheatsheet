package org.saatsch.javafx.cheatsheet.base;

import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import org.saatsch.javafx.cheatsheet.config.Config;
import org.saatsch.javafx.cheatsheet.model.java.SheetElement;

public class SheetsTree extends TreeView<SheetElement> {

  public SheetsTree() {

    TreeItem<SheetElement> config = Config.createConfig();
    setRoot(config);
    setCellFactory( p -> new SheetCell());

    setShowRoot(true);

  }
}
