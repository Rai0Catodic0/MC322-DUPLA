package mc322.lab06;

public class Brisa extends Componente {
    Brisa(int x, int y, Caverna caverna){
        super(x,y, caverna);
        caverna.salas[x][y].brisa = this;
    }
}
