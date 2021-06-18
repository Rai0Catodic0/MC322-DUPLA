package Itens;

import Tabuleiro.Tabuleiro;

import java.util.ArrayList;
import java.util.List;

public class Nave extends Item implements INave{

    public Nave(int i, int j, char repre, Tabuleiro tab){
        super(i,j,repre,tab);
    }

}
