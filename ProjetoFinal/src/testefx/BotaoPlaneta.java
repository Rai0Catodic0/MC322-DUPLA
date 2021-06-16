package testefx;

import Tabuleiro.Planeta;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BotaoPlaneta extends Button {
    Planeta planeta;
    BarraSelecao barraselecao;
    public BotaoPlaneta(Planeta planeta, BarraSelecao barra){
        super();
        this.planeta = planeta;
        this.barraselecao = barra;
        System.out.println(planeta.getImgpath());
        ImageView planetaImg = new ImageView(new Image(planeta.getImgpath()));
        this.setLayoutY(30);
        this.setLayoutX(30);
        this.setGraphic(planetaImg);
        this.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        this.setOnAction(actionEvent -> {
            this.barraselecao.Desenhar();
        });
    }


}
