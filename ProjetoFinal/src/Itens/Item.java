package Itens;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import Recursos.Recursos;
import Tabuleiro.Tabuleiro;

public class Item implements IItem {
    int i;
    int j;
    char representacao;
    Tabuleiro tabuleiro;

    public Item(int i, int j, char repre, Tabuleiro tab){
        this.tabuleiro = tab;
        this.i = i;
        this.j = j;
        this.representacao = repre;
        // inserir item no tabuleiro ???
    }
    @Override
    public int lutar() {
        Random gerador = new Random();
        return gerador.nextInt(6);
    }

}
