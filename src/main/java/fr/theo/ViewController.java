
/**
 * 'view.fxml' Controller Class
 */

package fr.theo;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Menu;

public class ViewController {

  // ResourceBundle that was given to the FXMLLoader
  @FXML private ResourceBundle resources;

  // URL location of the FXML file that was given to the FXMLLoader
  @FXML private URL location;

  // Values injected by FXMLLoader
  @FXML private Stage stage; // fx:id="stage"
  @FXML private Scene scene; // fx:id="stage"
  @FXML private SubScene subScene; // fx:id="subScene"
  @FXML private MenuBar menuBar; // fx:id="menuBar"
  @FXML private Menu editMenu; // fx:id="editMenu"
  @FXML private Menu fileMenu; // fx:id="fileMenu"
  @FXML private Menu helpMenu; // fx:id="helpMenu"

  // This method is called by the FXMLLoader when initialization is complete
  @FXML void initialize() {
    assert editMenu != null : "fx:id=\"editMenu\" was not injected: check your FXML file 'view.fxml'.";
    assert fileMenu != null : "fx:id=\"fileMenu\" was not injected: check your FXML file 'view.fxml'.";
    assert helpMenu != null : "fx:id=\"helpMenu\" was not injected: check your FXML file 'view.fxml'.";
    assert menuBar  != null : "fx:id=\"menuBar\" was not injected: check your FXML file 'view.fxml'.";
    assert subScene != null : "fx:id=\"subScene\" was not injected: check your FXML file 'view.fxml'.";
    // System.out.println(subScene.getAntiAliasing());
    new Renderer(subScene);
  }
}
