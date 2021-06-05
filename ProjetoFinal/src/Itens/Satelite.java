package Itens;

import Tabuleiro.Tabuleiro;

import java.util.Random;

public class Satelite extends Item implements ISatelite {

    public Satelite(int i, int j, char repre, Tabuleiro tab){
        super(i,j,repre,tab);
    }


    @Override
    public int lutar(){
        Random gerador = new Random();
        int soma =  gerador.nextInt(6) + gerador.nextInt(6) + gerador.nextInt(6);
        return soma;
    }

    @Override
    public Item ConstruirNave(char type) {
        Item nave;
        if(type == 'g'){
            nave = new NaveGuerra(this.i, this.j, this.representacao, this.tabuleiro);
        }
        else{
            nave = new NaveColonizadora(this.i, this.j, this.representacao, this.tabuleiro);
        }
        return  nave;
    }
}
