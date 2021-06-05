package Itens;

import Tabuleiro.Tabuleiro;

import java.util.ArrayList;
import java.util.List;

public class Nave extends Item implements INave{

    public Nave(int i, int j, char repre, Tabuleiro tab){
        super(i,j,repre,tab);
    }

    @Override
    public boolean movimentar(int iDestino,int jDestino) {
        //TODO implementar mover
        if(this.tabuleiro.planetas[iDestino][jDestino]==null){
            return false;
        }
        //FIXME arrumar encapsulamento:
        // - criar getters pra classe tabuleiro
        List<Item> items = this.tabuleiro.planetas[iDestino][jDestino].itens;
        boolean sateliteOponente;
        boolean navaGOponente;
        boolean naveCOponente;
        for(Item item : items){
            if(item instanceof NaveColonizadora ){
                if(this instanceof  NaveColonizadora){
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
