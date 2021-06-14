package testefx;

import Itens.Item;
import Itens.NaveGuerra;
import Itens.Satelite;
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
        Group sub = new Group();
        Scene scene = new Scene(root,2399,1199);
        stage.setTitle("Conquistadores do Espaço");
        //Image background = new Image("images/exemplo_interface.png");
        Image background = new Image("images/background.png");
        ImageView backgroundView = new ImageView(background);
        //backgroundView.setX(0);
        //backgroundView.setY(0);

        Tabuleiro tab = new Tabuleiro();
        NaveGuerra n = new NaveGuerra(0,1,'r',tab);
        Satelite s = new Satelite(0,1,'r',tab);
        tab.Inserir(s);
        //tab.Inserir(n);
        BarraLateral jogador1 = new BarraLateral(root);
        TabuleiroGrafico tabg = new TabuleiroGrafico(tab,root);
        BarraSelecao teste1 = new BarraSelecao(root);
        Tile t = new Tile(tab.getPlanetas()[0][1]);
        root.getChildren().add(backgroundView);
        root.getChildren().add(sub);
        root.getChildren().add(t);

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