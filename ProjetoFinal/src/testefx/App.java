package testefx;

import Itens.Item;
import Itens.NaveColonizadora;
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
    public BarraSelecao barraSelecao;

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

        barraSelecao  = new BarraSelecao(root, this);

        Tabuleiro tab = new Tabuleiro();
        //Item n = new NaveColonizadora(0,1,'a',tab);
        //Satelite s = new Satelite(0,1,'a',tab);
        //tab.Inserir(s);
        //tab.Inserir(n);
        BarraLateral jogador1 = new BarraLateral(root);

        TabuleiroGrafico tabg = new TabuleiroGrafico(tab,root,this);
        Tile t = new Tile(tab.getPlanetas()[0][1],this, tabg);

        root.getChildren().add(backgroundView);
        root.getChildren().add(sub);

        jogador1.Desenhar(tab.j.status());

        tabg.desenhar();
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}