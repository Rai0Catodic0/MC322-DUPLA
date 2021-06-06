package Itens;
import java.awt.image.BufferedImage;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

import App.Spritesheet;
import Recursos.Recursos;
import Tabuleiro.Tabuleiro;

public class Item implements IItem{
    private BufferedImage ImagemItem;
    private Spritesheet spritesheet;
    public int i;
    public int j;
    List<Recursos> coletados = new ArrayList<Recursos>();
    public char representacao;
    Tabuleiro tabuleiro;

    public Item(int i, int j, char repre, Tabuleiro tab){
        this.tabuleiro = tab;
        this.i = i;
        this.j = j;
        this.representacao = repre;
        // inserir item no tabuleiro ???
        //spritesheet = new Spritesheet("uma string com o caminho das imagens");
        //ImagemItem = spritesheet.getSpritesheet(0,0,600,400);
    }

    @Override
    public int lutar() {
        Random gerador = new Random();
        return gerador.nextInt(6);
    }

}
