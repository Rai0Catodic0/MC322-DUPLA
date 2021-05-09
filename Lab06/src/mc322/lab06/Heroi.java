package mc322.lab06;

public class Heroi extends Componente{
    int pontos;
    int flechas;
    boolean ouro;
    boolean noJogo;
    boolean armado;
    boolean vitoria;
    Heroi( Caverna caverna){
        super(1, 1, caverna);
        this.pontos = 0;
        this.flechas = 1;
        this.ouro = false;
        this.noJogo = true;
        this.armado = false;
        this.vitoria = false;
        this.caverna.Inserir(x,y,this);
    }
}
