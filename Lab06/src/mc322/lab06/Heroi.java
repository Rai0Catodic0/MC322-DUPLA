package mc322.lab06;

public class Heroi extends Componente{
    int pontos;
    int flechas;
    boolean ouro;
    boolean noJogo;
    boolean armado;
    boolean vitoria;
    Heroi( Caverna caverna){
        super(0, 0, caverna);
        System.out.println(x+" "+y);
        this.pontos = 0;
        this.flechas = 1;
        this.ouro = false;
        this.noJogo = true;
        this.armado = false;
        caverna.Inserir(x,y,this);
    }
    public Salas mover(int x,int y){
        if(x<0 || x>3 || y<0 || y>3) {
            return null;
        }
        int xAnterior = this.x;
        int yAnterior = this.y;
        this.x = x;
        this.y = y;
        caverna.Inserir(x,y, this);
        caverna.salas[yAnterior][xAnterior].Remover(this);
        return  caverna.salas[this.y][this.x];
    }
}
