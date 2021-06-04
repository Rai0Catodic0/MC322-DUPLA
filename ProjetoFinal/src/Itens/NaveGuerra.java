package Itens;

import Tabuleiro.Tabuleiro;
import java.util.Random;

public class NaveGuerra extends Nave implements INave{
    public NaveGuerra(int i, int j, char repre, Tabuleiro tab) {
        super(i, j, repre, tab);
    }
    @Override
    public int lutar(){
        Random gerador = new Random();
        int result = gerador.nextInt(6)+gerador.nextInt(6)+gerador.nextInt(6);
        return result;
    }
}
