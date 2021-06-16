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

import Tabuleiro.Planeta;

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

        //Cria dois Tabuleiros
        Tabuleiro tab = new Tabuleiro();
        TabuleiroGrafico tabg = new TabuleiroGrafico(root);

        //Linka Tile com planeta

        Planeta planetas[][] = tab.getPlanetas();
        int k = 0;
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4;j++){
                if(planetas[i][j]!=null){
                    planetas[i][j].setTile(tabg.botoes.get(k));
                    k++;
                }
            }
        }

        tabg.Desenhar();

        //Item n = new NaveColonizadora(0,1,'a',tab);
        //Satelite s = new Satelite(0,1,'a',tab);
        //tab.Inserir(s);
        //tab.Inserir(n);
        BarraLateral jogador1 = new BarraLateral(root);

        root.getChildren().add(backgroundView);
        root.getChildren().add(sub);

        jogador1.Desenhar(tab.j.status());

        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}