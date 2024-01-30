package app;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenu extends Application {
    private Stage stage;
    public static void main(String[] args) {
        launch(args);
    }

    public void displayClothesMenu(ActionEvent event) throws IOException {
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/display/ClothesMenu.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @Override
    public void start(Stage stage1) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader();
//        fxmlLoader.load();
        Parent root = FXMLLoader.load(getClass().getResource("/display/MainMenu.fxml"));
        Scene scene = new Scene(root);
        stage1.setScene(scene);
        stage1.show();
    }
}
