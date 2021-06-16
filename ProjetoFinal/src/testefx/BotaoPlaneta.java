package testefx;

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
    Planeta planeta;
    BarraSelecao barraSelecao;
    public BotaoPlaneta(Planeta planeta, BarraSelecao barraSelecao){
        super();
        this.planeta = planeta;
        this.barraSelecao = barraSelecao;
        System.out.println(planeta.getImgpath());
        ImageView planetaImg = new ImageView(new Image(planeta.getImgpath()));
        this.setLayoutY(30);
        this.setLayoutX(30);
        this.setGraphic(planetaImg);
        this.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        this.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
               barraSelecao.Desenhar(planeta);
            }
        });
    }

}
