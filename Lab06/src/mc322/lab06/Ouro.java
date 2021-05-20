package mc322.lab06;

public class Ouro extends Componente{
    int x, y;
    Caverna caverna;

    Ouro(int x, int y, Caverna caverna){
        this.x = x;
        this.y = y;
        this.caverna = caverna;
        this.caverna.Inserir(x,y,this);
    }
}
