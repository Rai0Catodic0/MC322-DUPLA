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

    public List<Recursos> getColetados() {
        return coletados;
    }

    public String getType(){
        String type;
        if(this instanceof NaveGuerra){
            type = "naveguerra";
            System.out.println("tipo :guerra -> ");
        }else if(this instanceof NaveColonizadora){
             type = "navecolonizadora";
            System.out.println("tipo :colonizadora -> ");
        }
        else {
            type = "satelite";
            System.out.println("tipo :satelite -> ");
        }
        return type;
    }
    public String getImgPath(){
        String imgPath;
        imgPath = "images/"+this.getType()+this.representacao+".png";
        return imgPath;
    }
}
