package testefx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
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
        Image nave = new Image("testefx/nave.png");
        ImageView naveView = new ImageView(nave);
        naveView.setY(260);
        naveView.setX(15);


        Rectangle interfaceRecursos = new Rectangle();
        interfaceRecursos.setHeight(400);
        interfaceRecursos.setWidth(140);
        interfaceRecursos.setY(250);
        interfaceRecursos.setFill(Color.GRAY);

        BarraLateral jogador1 = new BarraLateral(root);
        BotaoPlaneta p = new BotaoPlaneta("planeta.png");
        BarraSelecao teste1 = new BarraSelecao(root);

        root.getChildren().add(backgroundView);
        //root.getChildren().add(interfaceRecursos);
        //root.getChildren().add(naveView);
        root.getChildren().add(p);
        jogador1.Desenhar(0,5,4,1,1,3);
        teste1.Desenhar();
        stage.setScene(scene);
        stage.show();
    }


    public static void Main(String[] args) {
        launch(args);
    }
}