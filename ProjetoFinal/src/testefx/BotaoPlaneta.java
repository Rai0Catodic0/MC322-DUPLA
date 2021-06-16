package testefx;

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
    Planeta planeta;

    BarraSelecao barraSelecao;
    public BotaoPlaneta(Planeta planeta, App app, TabuleiroGrafico tg){
        super();
        this.planeta = planeta;
        this.barraSelecao = app.barraSelecao;

        System.out.println(planeta.getImgpath());
        ImageView planetaImg = new ImageView(new Image(planeta.getImgpath()));
        this.setLayoutY(30);
        this.setLayoutX(30);
        this.setGraphic(planetaImg);
        this.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        this.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                barraSelecao.setPlanetaClicado(planeta);
                if(barraSelecao.getMover() && barraSelecao.getNaveColonizadoraSelecionada()){
                    Planeta planetaRecebeAcao = barraSelecao.getPlanetaRecebeAcao();
                    Item itemMovido = ObterNaveColonizadoraMovida(planetaRecebeAcao);
                    tg.RemoverItem(itemMovido  , planetaRecebeAcao.getI(), planetaRecebeAcao.getJ());
                    tg.AdicionarItem(itemMovido, planeta.getI(), planeta.getJ());
                } else if(barraSelecao.getMover() && barraSelecao.getNaveGuerraSelecionada()) {
                    System.out.println("Move para cá a nave de guerra");
                } else {
                    barraSelecao.Desenhar(planeta);
                }
            }
        });
    }

    public Item ObterNaveColonizadoraMovida(Planeta planeta){
        for(Item item : planeta.getItens()){
           if(item instanceof NaveColonizadora){
               return item;
           }
        }
        return null;
    }

}
