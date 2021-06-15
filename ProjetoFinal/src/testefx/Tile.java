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

    public Tile(Planeta planeta ) {
        super();
        this.resize(100,100);
        this.planeta = planeta;
        this.items = planeta.getItens();

        int[] position = planeta.getPixelsPosition();
        this.setLayoutX(position[1]);
        this.setLayoutY(position[0]);
        BotaoPlaneta botao = new BotaoPlaneta(this.planeta);
        ImageView images[] = new ImageView[3];
        int i=0;
        for(Item item : this.items){
            images[i] = new ImageView(new Image(item.getType()));
            images[i].setX(110*i);
            images[i].setY(110*i);
            this.getChildren().add(images[i]);
            i++;
        }
        this.getChildren().add(botao);
    }
}
