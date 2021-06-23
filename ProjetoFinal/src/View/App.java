package View;

import Tabuleiro.Tabuleiro;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

//FIXME impedir um jogador de mover a nave do outro , e arrumar o bug na hora de mover



import Tabuleiro.Planeta;
import javafx.util.Duration;

public class App extends Application {
    public BarraSelecao barraSelecao;
    public Tabuleiro tab;


    @Override
    public void start(Stage stage) throws Exception{
        Group root = new Group();
        Group sub = new Group();
        Scene scene = new Scene(root,2399,1199);
        stage.setTitle("Conquistadores do Espaço");
        Image background = new Image("images/background.png");
        ImageView backgroundView = new ImageView(background);

        //Cria dois Tabuleiros e controle
        tab = new Tabuleiro();
        BarraLateral barraLateral = new BarraLateral(root);
        Controle controle = new Controle(tab, barraLateral, root);
        barraSelecao  = new BarraSelecao(root, controle);
        TabuleiroGrafico tabg = new TabuleiroGrafico(root, barraSelecao);

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
        System.out.println("aqui 1");
        root.getChildren().add(backgroundView);
        System.out.println("aqui 2");
        root.getChildren().add(sub);
        System.out.println("aqui 3");
        tabg.Desenhar();
        System.out.println("aqui 4");
        int l = 0;
        while(l<100000){
            System.out.println("loop");
        }
        stage.setScene(scene);
        System.out.println("aqui 5");
        stage.show();
        System.out.println("aqui 6");

    }


    public static void main(String[] args) {
        launch(args);
    }
}