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
    List<Tile> botoes = new ArrayList();

    public TabuleiroGrafico(Tabuleiro tabuleiro, Group root, App app){
        this.root = root;
        this.tab = tabuleiro;
        Planeta[][] planetas = tab.getPlanetas();
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(planetas[i][j]!=null){
                    botoes.add(new Tile(planetas[i][j], app, this));
                }
            }
        }
    }

    public void RemoverItem(Item item, int i, int j){
        System.out.println("NA FUNÇÃOOOO");
        for (Tile botao : botoes) {
            if(botao.planeta.getI()==i && botao.planeta.getJ()==j){
                System.out.println("vou remover");
                botao.Esconder();
                botao.planeta.Remover(item);
                botao.Desenhar();
            }
        }
    }

    public void AdicionarItem(Item item, int i, int j){
        System.out.println("NA FUNÇÃOOOO");
        for (Tile botao : botoes) {
            if(botao.planeta.getI()==i && botao.planeta.getJ()==j){
                System.out.println("vou inserir");
                botao.planeta.Inserir(item);
                botao.Desenhar();
            }
        }
    }

    public void desenhar() {
        for (Tile botao : botoes) {
            this.root.getChildren().add(botao);
        }
    }
}
