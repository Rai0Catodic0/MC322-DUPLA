package mc322.lab06;

public class Brisa extends Componente {
    Brisa(int x, int y, Caverna caverna){
        super(x,y, caverna);
        this.caverna.Inserir(x,y,this);
    }
}
