package testefx;

import Itens.Item;
import Tabuleiro.Tabuleiro;
import Tabuleiro.Planeta;
import javafx.scene.Group;
import javafx.scene.layout.StackPane;

import java.util.ArrayList;
import java.util.List;

public class TabuleiroGrafico  {
    Tabuleiro tab;
    Group root;
    List<Tile> botoes = new ArrayList<>();

    public TabuleiroGrafico(Group root, BarraSelecao controle){
        this.root = root;
        for(int i =0; i<16;i++){
            botoes.add(new Tile(controle));
        }
    }

    public boolean Desenhar(){
        for (Tile botao : botoes) {
            this.root.getChildren().add(botao);
        }
        return true;
    }

}
