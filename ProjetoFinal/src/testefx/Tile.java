package testefx;

import Itens.Item;
import Tabuleiro.Planeta;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Tile extends Group {
    Planeta planeta;
    List<Item> items = new ArrayList<>();

    public Tile(Planeta planeta ) {
        super();
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
            this.getChildren().add(images[i]);
        }
        this.getChildren().add(botao);
    }
}
