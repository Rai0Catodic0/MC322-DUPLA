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
        //repre dever ser ou a ou v
        //a = jogador azul
        //v = jogador verde
        this.tabuleiro = tab;
        this.i = i;
        this.j = j;
        this.representacao = repre;
    }

    @Override
    public int lutar() {
        Random gerador = new Random();
        return gerador.nextInt(6);
    }

    @Override
    public List<Integer> getPosition() {
        List<Integer> position = new ArrayList<>();
        position.add(this.i);
        position.add(this.j);
        return  position;
    }

    public String getType(){
        String path = "images/";
        if(this instanceof NaveGuerra){
            path = path+"naveguerra"+this.representacao+".png";
            System.out.println("tipo :guerra -> "+path);
        }else if(this instanceof NaveColonizadora){
            path = path+"navecolonizadora"+this.representacao+".png";
            System.out.println("tipo :colonizadora -> "+path);
        }
        else {
            path = path+"satelite"+this.representacao+".png";
            System.out.println("tipo :satelite -> "+path);
        }
        return path;
    }
}
