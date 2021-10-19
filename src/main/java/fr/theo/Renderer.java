package fr.theo;


import javafx.scene.Group;
import javafx.scene.SubScene;

public class Renderer {

  private SubScene subScene;
  private Group root;

  public Renderer(SubScene subScene) {
    this.subScene = subScene;
    this.subScene.setRoot(new Group());
  }

}
