package mc322.lab06;

import java.util.Scanner;

public class Controle {

    Heroi heroi = null;      //ponteiro do heroi que será controlado
    int pontuacao = 0;
    String jogador;

    Controle(Heroi heroi){
        this.heroi = heroi;
    }

    //public void setJogador(String jogador){
    // this.jogador = jogador;
    //}

    public void IniciarJogo(){
        String movimento = null;
        Scanner Keyboard = new Scanner(System.in);
        jogador = Keyboard.nextLine();
        System.out.print(heroi.caverna.apresenta());
        if(heroi != null){       //exige heroi instanciado
            while(heroi.noJogo){
                movimento = Keyboard.nextLine();
                switch (movimento){
                    case "w":
                        heroi.mover(heroi.x, heroi.y-1);
                        break;
                    case "s":
                        heroi.mover(heroi.x, heroi.y+1);
                        break;
                    case "d":
                        heroi.mover(heroi.x+1, heroi.y);
                        break;
                    case "a":
                        heroi.mover(heroi.x-1, heroi.y);
                        break;
                    case "k":
                        //Heroi.AtivarFlecha();
                        break;
                    case "c":
                        //heroi.CapturarOuro();
                        break;
                    case "q":
                        break;
                }
                System.out.print(heroi.caverna.apresenta());
                System.out.println("Player: "+jogador);
                System.out.println("Score: "+pontuacao);
            }
            if(heroi.vitoria){
                System.out.println("Parabéns, você venceu!!!");
            } else if(movimento=="q"){
                System.out.println("Volte sempre!!!");
            } else {
                System.out.println("Você perdeu, mas não desista de ganhar!!!");
            }
        }
    }
}