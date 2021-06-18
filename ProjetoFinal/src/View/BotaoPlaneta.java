package View;

import Itens.Item;
import Itens.NaveColonizadora;
import Tabuleiro.Planeta;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Observer;

public class BotaoPlaneta extends Button {

    public BotaoPlaneta(String imhpath, int[] positions){
        super();
        ImageView planetaImg = new ImageView(new Image(imhpath));
        this.setLayoutY(30);
        this.setLayoutX(30);
        this.setGraphic(planetaImg);
        this.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

    }


}
