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
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ADICIONANDO TILES NA LISTA TABG");
        this.root = root;
        for(int i =0; i<16;i++){
            botoes.add(new Tile(controle));
        }
    }

    public void Desenhar(){
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ADICIONANDO LISTA DO TABG NA ROOT");
        for (Tile botao : botoes) {
            this.root.getChildren().add(botao);
        }
    }

}
