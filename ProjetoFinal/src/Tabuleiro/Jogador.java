package Tabuleiro;

import Itens.Item;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    int pontuacao;
    int i;
    int j;
    List<Item> itens = new ArrayList<Item>();

    Jogador(int i, int j){
        this.i = i;
        this.j = j;
    }

    public void setItens(Item nave, Item satelite){
        this.itens.add(nave);
        this.itens.add(satelite);
    }
}
