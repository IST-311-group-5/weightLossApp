/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author liamb
 */
public class ProfileViewController implements Initializable {

  @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button viewLogButton;

    @FXML
    private Button createLogButton;

    @FXML
    void createLog(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/DetailedModelView.fxml"));

        Parent detailedModelView = loader.load();

        Scene tableViewScene = new Scene(detailedModelView);

        DetailedModelViewController detailedControlled = loader.getController();

        Stage stage = new Stage();
        stage.setScene(tableViewScene);
        stage.show();
    }

    @FXML
    void viewLog(ActionEvent event) {

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

}
