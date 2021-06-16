package testefx;

import Itens.Item;
import Tabuleiro.Planeta;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.util.ArrayList;
import java.util.List;

public class Tile extends Pane {
    Planeta planeta;
    List<Item> items = new ArrayList<>();
    BotaoPlaneta botao;
    TabuleiroGrafico tg;
    ImageView images[];

    public Tile(Planeta planeta, App app, TabuleiroGrafico tg ) {
        super();
        this.tg = tg;
        this.resize(100,100);
        this.planeta = planeta;
        int[] position = planeta.getPixelsPosition();
        this.setLayoutX(position[1]);
        this.setLayoutY(position[0]);
        botao = new BotaoPlaneta(this.planeta, app, tg);
        this.getChildren().add(botao);
        this.Desenhar();
    }

    public void Esconder(){
        int i = 0;
        for(Item item : this.items){
            System.out.println("Essa é a imagem removida: "+images[i]);
            this.getChildren().remove(images[i]);
            i++;
        }
    }

    public void Desenhar(){
        images = new ImageView[3];
        this.items = planeta.getItens();
        int i = 0;
        for(Item item : this.items){
            images[i] = new ImageView(new Image(item.getType()));
            images[i].setX(110*i);
            images[i].setY(110*i);
            System.out.println("Essa é a imagem CRIADA: "+images[i]);
            this.getChildren().add(images[i]);
            i++;
        }
    }
}
