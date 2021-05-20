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
        if(this.armado){
            this.armado = false;
            this.flechas = 0;
            System.out.println("Você lançou sua flecha!");
        }
        if(x<0 || x>3 || y<0 || y>3) {
            System.out.println("Movimento inválido, você está fora dos limites da caverna!");
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
                System.out.println("Você não conseguiu matar o monstro!");
                this.noJogo = false;
            }else{
                this.armado = false;
                caverna.salas[y][x].Remover(caverna.salas[y][x].wunpus);
                this.pontos +=500;
                System.out.println("O monstro foi morto!");
            }
        }
        if(this.x == 0 && this.y == 0 && this.ouro == true){
            this.noJogo = false;
            this.vitoria = true;
            this.pontos += 1000;
            System.out.println("Saiu da caverna com o Ouro!");
        }
        return  caverna.salas[this.x][this.y];
    }
    public void AtivarFlecha(){
        if(flechas<0){
            System.out.println("Você não tem mais flechas para ativar =(");
        }
        else {
            this.flechas -= 1;
            this.pontos -= 100;
            this.armado = true;
            System.out.println("Flecha ativada!");
        }
    }
    public void CapturarOuro(){
        if(caverna.salas[y][x].ouro!=null){
            this.ouro = true;
            caverna.Remover(x,y);
            System.out.println("Você capturou o ouro! Agora, saia da caverna com segurança!");
        }
        else{
            System.out.println("Não há our para ser capturado nessa sala =(");
        }
    }
}
