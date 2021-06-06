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

        //FIXME arrumar encapsulamento:
        // - criar getters pra classe tabuleiro

        boolean sateliteOponente;
        boolean navaGOponente;
        boolean naveCOponente;

        return false;
    }
}
