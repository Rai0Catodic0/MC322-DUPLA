package testefx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        //Stage stage = new Stage();
        Group root = new Group();
        Scene scene = new Scene(root);
        stage.setTitle("Conquistadores do Espaço");
        Image background = new Image("background.jpeg");
        ImageView backgroundView = new ImageView(background);
        backgroundView.setX(0);
        backgroundView.setY(0);
        Image nave = new Image("nave.png");
        ImageView naveView = new ImageView(nave);
        naveView.setY(260);
        naveView.setX(15);


        Rectangle interfaceRecursos = new Rectangle();
        interfaceRecursos.setHeight(400);
        interfaceRecursos.setWidth(140);
        interfaceRecursos.setY(250);
        interfaceRecursos.setFill(Color.GRAY);


        BotaoPlaneta p = new BotaoPlaneta("planeta.png");

        root.getChildren().add(backgroundView);
        root.getChildren().add(interfaceRecursos);
        root.getChildren().add(naveView);
        root.getChildren().add(p);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}