package org.saatsch.javafx.cheatsheet.base;

import javafx.scene.control.TreeCell;
import org.saatsch.javafx.cheatsheet.model.java.SheetElement;

public class SheetCell extends TreeCell<SheetElement> {

  @Override
  protected void updateItem(SheetElement sheetElement, boolean empty) {
    super.updateItem(sheetElement, empty);
    if (sheetElement != null){
      setText(sheetElement.getName());
    }
  }
}
