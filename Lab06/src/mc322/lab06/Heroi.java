package mc322.lab06;

import java.security.cert.TrustAnchor;

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
        System.out.println(x+" "+y);
        if(x<0 || x>3 || y<0 || y>3) {
            System.out.println("fora da borda");
            System.out.println("x"+x);
            System.out.println("y"+y);
            return null;
        }
        int xAnterior = this.x;
        int yAnterior = this.y;
        this.x = x;
        this.y = y;
        caverna.Inserir(y,x, this);
        caverna.salas[yAnterior][xAnterior].Remover(this);
        this.pontos -= 15;
        if(caverna.salas[y][x].buraco!=null){
            this.noJogo = false;
            this.pontos -= 1000;
        }
        else if(caverna.salas[y][x].wunpus != null){
            int resultado = caverna.salas[y][x].wunpus.lutarComHeroi(this.armado);
            if(resultado == 1){
                this.pontos -= 1000;
                this.noJogo = false;
            }else{
                this.armado = false;
                caverna.salas[y][x].Remover(caverna.salas[y][x].wunpus);
                this.pontos +=500;
            }
        }
        return  caverna.salas[this.x][this.y];
    }
    public void AtivarFlecha(){
        if(flechas<0){
            System.out.println("não há flechas ");
        }
        else {
            this.flechas -= 1;
            this.pontos -= 100;
            this.armado = true;
        }
    }
    public void CapturarOuro(){
        if(caverna.salas[y][x].ouro!=null){
            this.ouro = true;
            caverna.Remover(x,y);
        }
        else{
            System.out.println("não tem ouro nessa sala");
        }
    }
}
