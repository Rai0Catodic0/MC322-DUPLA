package mc322.lab06;

public class Brisa extends Componente {
    Brisa(int x, int y, Caverna caverna){
        super(x,y, caverna);
<<<<<<< HEAD
        caverna.salas[x][y].brisa = this;
=======
        this.caverna.Inserir(x,y,this);
>>>>>>> 00cb8d9a4cdcf7d54298e3357e610a8361fef8e1
    }
}
