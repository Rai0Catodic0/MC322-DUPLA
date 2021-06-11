package testefx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        //Stage stage = new Stage();
        Group root = new Group();
        Scene scene = new Scene(root);
        stage.setTitle("Conquistadores do Espaço");
        Image background = new Image("background.png");
        ImageView backgroundView = new ImageView(background);
        backgroundView.setX(0);
        backgroundView.setY(0);


        BarraLateral jogador1 = new BarraLateral(root);
        BotaoPlaneta p = new BotaoPlaneta("planeta.png");
        BarraSelecao teste1 = new BarraSelecao(root);

        root.getChildren().add(backgroundView);
        root.getChildren().add(p);
        jogador1.Desenhar(0,5,4,1,1,3);
        teste1.Desenhar();
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}