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

    public void mover(int x,int y){
        System.out.println(x+" "+y);
        if(this.armado){
            this.armado = false;
            this.flechas = 0;
            System.out.println("Você lançou sua flecha!");
        }
        if(x<0 || x>3 || y<0 || y>3) {
            System.out.println("Movimento inválido, você está fora dos limites da caverna!");
        }
        System.out.println();
        int xAnterior = this.x;
        int yAnterior = this.y;
        this.x = x;
        this.y = y;
        caverna.Inserir(x,y, this);
        caverna.Remover(xAnterior,yAnterior,this);
        this.pontos -= 15;
        Salas sala = caverna.VerSala(x,y);
        if(sala.buraco!=null){
            this.noJogo = false;
            this.pontos -= 1000;
        }
        else if(sala.wunpus != null){
            int resultado = sala.wunpus.lutarComHeroi(this.armado);
            if(resultado == 1){
                this.pontos -= 1000;
                System.out.println("Você não conseguiu matar o monstro!");
                this.noJogo = false;
            }else{
                this.armado = false;
                caverna.Remover(x,y,sala.wunpus);
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
        Salas sala = caverna.VerSala(x,y);
        if(sala.ouro!=null){
            this.ouro = true;
            caverna.Remover(x,y,sala.ouro);
            System.out.println("Você capturou o ouro! Agora, saia da caverna com segurança!");
        }
        else{
            System.out.println("Não há our para ser capturado nessa sala =(");
        }
    }
}
