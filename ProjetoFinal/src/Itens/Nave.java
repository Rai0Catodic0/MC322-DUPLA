package Itens;

public class Nave extends Item implements INave{

    public Nave(int i, int j, char repre, Tabuleiro tab){
        super(i,j,repre,tab);
    }

    @Override
    public boolean movimentar() {
        return false;
    }
}
