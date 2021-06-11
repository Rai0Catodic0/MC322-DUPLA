package testefx;

import Tabuleiro.Planeta;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BotaoPlaneta extends Button {
    Planeta planeta;
    public BotaoPlaneta(Planeta planeta){
        super();
        this.planeta = planeta;
        ImageView planetaImg = new ImageView(new Image(planeta.getImgpath()));
        this.setGraphic(planetaImg);
         int[] position = planeta.getPixelsPosition();
        this.setLayoutX(position[1]);
        this.setLayoutY(position[0]);
        this.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
    }


}
