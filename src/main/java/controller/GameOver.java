package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class GameOver implements Initializable {
    @FXML Button botonGuardarSalir;
    @FXML AnchorPane gameOverAnchorPane;
    private Scene scene;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void guardarSalir(ActionEvent actionEvent) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/menuWindow.fxml"));
            AnchorPane anchorPane = loader.load();
            gameOverAnchorPane.getChildren().add(anchorPane);

            GameOver gameOver = loader.getController();
            gameOver.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setScene(Scene sc) {
        scene = sc;
    }
}
