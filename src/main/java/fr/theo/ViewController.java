
/**
 * 'view.fxml' Controller Class
 */

package fr.theo;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.Camera;
import javafx.scene.PerspectiveCamera;
import javafx.scene.shape.TriangleMesh;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.paint.Color;
import javafx.scene.shape.MeshView;
import javafx.scene.shape.DrawMode;

public class ViewController {

  // ResourceBundle that was given to the FXMLLoader
  @FXML private ResourceBundle resources;

  // URL location of the FXML file that was given to the FXMLLoader
  @FXML private URL location;

  // Values injected by FXMLLoader
  @FXML private Stage stage; // fx:id="stage"
  @FXML private Scene scene; // fx:id="stage"
  @FXML private Group group; // fx:id="group"

  // This method is called by the FXMLLoader when initialization is complete
  @FXML void initialize() {
    Camera camera = new PerspectiveCamera();
    camera.setNearClip(0);
    camera.setFarClip(10000);
    camera.translateXProperty().set(-scene.getWidth() / 2);
    camera.translateYProperty().set(scene.getHeight() / 2);
    camera.translateZProperty().set(-500);
    TriangleMesh mesh = new TriangleMesh();
    mesh.getTexCoords().addAll(0, 0);
    float h = 150;
    float s = 300;
    mesh.getPoints().addAll(
         0, 0,    0,
         0, h, -s/2,
      -s/2, h,    0,
       s/2, h,    0,
         0, h,  s/2
    );
    mesh.getFaces().addAll(
      0, 0,  2, 0,  1, 0,
      0, 0,  1, 0,  3, 0,
      0, 0,  3, 0,  4, 0,
      0, 0,  4, 0,  2, 0,
      4, 0,  1, 0,  2, 0,
      4, 0,  3, 0,  1, 0
    );
    PhongMaterial material = new PhongMaterial();
    material.setDiffuseColor(Color.DARKBLUE);
    material.setSpecularColor(Color.BLUE);
    MeshView view = new MeshView(mesh);
    view.setDrawMode(DrawMode.FILL);
    view.setMaterial(material);
    group.getChildren().addAll(view, camera);
    scene.setRoot(group);
  }
}







