package testefx;

import Tabuleiro.Tabuleiro;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        //Stage stage = new Stage();
        Group root = new Group();
        Scene scene = new Scene(root);
        stage.setTitle("Conquistadores do Espaço");
        //Image background = new Image("images/exemplo_interface.png");
        Image background = new Image("images/background.png");
        ImageView backgroundView = new ImageView(background);
        //backgroundView.setX(0);
        //backgroundView.setY(0);

        Tabuleiro tab = new Tabuleiro();
        BarraLateral jogador1 = new BarraLateral(root);
        TabuleiroGrafico tabg = new TabuleiroGrafico(tab,root);
        BarraSelecao teste1 = new BarraSelecao(root);

        root.getChildren().add(backgroundView);
        jogador1.Desenhar(0,5,4,1,1,3);
        teste1.Desenhar();
        tabg.desenhar();
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}