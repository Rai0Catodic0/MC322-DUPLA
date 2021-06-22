package View;

import Itens.Item;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.util.ArrayList;
import java.util.List;

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

    //TODO classe separada pra luta
    // tudo bem classe meio inuteis
    // so uma interface tá show
    //FIXME isso nao deveria ser um construtor ?
    public void IniciarTile(){
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

    // metodos pra modificar o tile
    public void Esconder(){
        System.out.println("Esse é o items no esconder: "+items+" do planeta "+this.id);

        for(int i = 0; i<3;i++){
            this.getChildren().remove(images[i]);
            images[i] = null;

        }
    }

    public void Desenhar(){
        System.out.println("Esse é a lista de itens q vou desenhra: "+items+" no planeta "+this.id);
        int i = 0;
        for(Item item : this.items){
            images[i] = new ImageView(new Image(item.getImgPath()));
            images[i].setX(100*i);
            images[i].setY(100*i);
            //System.out.println("Essa é o item criado: "+item);
            this.getChildren().add(images[i]);
            i++;
        }
    }

    public void update(List<Item> itens){
        System.out.println("Essa é a nova lista de planetas que será atualizada no plabeta "+this.id+", "+itens);
        Esconder();
        this.items = itens;
        Desenhar();
    }

    // setrs e getrs
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
}
