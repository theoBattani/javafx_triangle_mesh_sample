
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
import javafx.scene.shape.TriangleMesh;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.paint.Color;
import javafx.scene.shape.MeshView;
import javafx.scene.shape.CullFace;
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
    stage.setWidth(640);
    stage.setHeight(640);
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
    MeshView meshView = new MeshView(mesh);
    meshView.setDrawMode(DrawMode.FILL);
    meshView.setMaterial(material);
    meshView.setCullFace(CullFace.BACK);
    meshView.setTranslateX(stage.getWidth() / 2);
    meshView.setTranslateY(stage.getHeight() / 2);
    meshView.setTranslateZ(1);
    group.getChildren().addAll(meshView);
  }
}







