package testefx;

import Itens.Item;
import Tabuleiro.Planeta;
import javafx.beans.InvalidationListener;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Tile extends Pane {
    List<Item> items = new ArrayList<>();
    BotaoPlaneta botao;
    ImageView images[];
    String imgpath;
    int positions[];
    int id;
    BarraSelecao controle;

    public Tile(BarraSelecao controle) {
        super();
        this.resize(100,100);
        images = new ImageView[3];
        this.controle = controle;
    }

    public void IniciarTile(){
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ADICIONANDO O BOTAO DO PLANETA NO TILE");
        botao = new BotaoPlaneta(imgpath, positions);
        botao.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                controle.ClicouPlaneta(id, items);
            }
        });
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
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ADICIONANDO O ITENS NO TILE");
        int i = 0;

        for(Item item : this.items){
            images[i] = new ImageView(new Image(item.getImgPath()));
            images[i].setX(110*i);
            images[i].setY(110*i);
            System.out.println("Essa é a imagem CRIADA: "+images[i]);
            this.getChildren().add(images[i]);
            i++;
        }
    }

    public void setPlanetaId(int i){
        this.id = i;
    }

    public void setImgpath(String imgpath){
        this.imgpath = imgpath;
    }

    public void setItems(List<Item> items){
        this.items = items;
    }

    public void setPositionsPixels(int[] positions){
        this.positions = positions;
        this.setLayoutX(positions[1]);
        this.setLayoutY(positions[0]);
    }

    public void update(List<Item> itens){
        this.items = itens;
        Esconder();
        Desenhar();
    }

}
