package View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("View.fxml"));
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);

        BarraLateral jogador1 = new BarraLateral(root);

        primaryStage.setTitle("Hello World");
        primaryStage.setHeight(639);
        primaryStage.setWidth(1280);
        primaryStage.setScene(scene);

        jogador1.Desenhar(5,3,2,0,0,1);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
