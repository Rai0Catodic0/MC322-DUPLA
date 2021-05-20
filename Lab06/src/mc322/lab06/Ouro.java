package mc322.lab06;

public class Ouro extends Componente{

    Ouro(int x, int y, Caverna caverna){
        super(x, y, caverna);
        this.caverna.Inserir(x,y,this);
    }
}
