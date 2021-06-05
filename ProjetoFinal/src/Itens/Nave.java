package Itens;

import Tabuleiro.Tabuleiro;

public class Nave extends Item implements INave{

    public Nave(int i, int j, char repre, Tabuleiro tab){
        super(i,j,repre,tab);
    }

    @Override
    public boolean movimentar() {
        //TODO implementar mover
        return false;
    }
}
