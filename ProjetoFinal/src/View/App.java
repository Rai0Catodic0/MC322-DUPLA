package View;

import Tabuleiro.Tabuleiro;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
//FIXME impedir um jogador de mover a nave do outro , e arrumar o bug na hora de mover



import Tabuleiro.Planeta;

public class App extends Application {
    public BarraSelecao controle;
    public Tabuleiro tab;


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

        controle  = new BarraSelecao(root, this);

        //Cria dois Tabuleiros
        tab = new Tabuleiro();
        TabuleiroGrafico tabg = new TabuleiroGrafico(root, controle);

        //Linka Tile com planeta

        Planeta planetas[][] = tab.getPlanetas();
        int k = 0;
        for(int i = 0; i<5; i++){
            for(int j = 0; j<5;j++){
                if(planetas[i][j]!=null){
                    planetas[i][j].setTile(tabg.botoes.get(k));
                    k++;
                }
            }
        }


        BarraLateral jogador1 = new BarraLateral(root);

        root.getChildren().add(backgroundView);
        root.getChildren().add(sub);

        jogador1.Desenhar(tab.j.status());
        tabg.Desenhar();
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}