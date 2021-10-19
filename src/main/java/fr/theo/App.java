
package fr.theo;

import fr.theo.util.fxml.Loader;

import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

  @Override 
  public void start(Stage stage) throws IOException {
    ((Stage) Loader.loadFXML("view")).show();
  }

  public static void main(String[] args) {launch(args);}
}










