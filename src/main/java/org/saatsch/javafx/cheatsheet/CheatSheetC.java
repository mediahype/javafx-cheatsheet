package org.saatsch.javafx.cheatsheet;

import javafx.scene.control.SplitPane;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import org.saatsch.javafx.cheatsheet.base.LeftList;

/**
 * main composite of the cheatsheet app. It is a VBox that contains a SplitPane.
 *
 *
 */
public class CheatSheetC extends VBox {

  public CheatSheetC() {
    SplitPane splitPane = new SplitPane(new LeftList(), new Pane());

    TreeView<String> tv = new TreeView<>();
    tv.setRoot(new TreeItem<>("root"));
    TreeItem<String> level1 = new TreeItem<>("Level1");
    level1.getChildren().add(new TreeItem<>("Level2"));
    tv.getRoot().getChildren().add(level1);


    getChildren().add(tv);


    VBox.setVgrow(splitPane, Priority.ALWAYS);

  }
}
