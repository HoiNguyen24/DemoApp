package app;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Dialog;
import javafx.stage.Stage;
import src.model.Clothes;



public class ClothesMenu extends Application {
    private Stage stage;
    public static void main(String[] args) {
        launch(args);
    }

    public void addClothes(ActionEvent event){
        Dialog<Clothes> dialog = new Dialog<Clothes>();

    }
    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}
