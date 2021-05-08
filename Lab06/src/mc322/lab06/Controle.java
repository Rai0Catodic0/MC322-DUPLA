package mc322.lab06;

import java.util.Scanner;

public class Controle {

    Heroi heroi = null;      //ponteiro do heroi que será controlado
    int pontuacao = 0;
    String jogador;

    Controle( Heroi heroi){
        this.heroi = heroi;                                //recebe ponteiro para herói no construtor
        Scanner Keyboard = new Scanner(System.in);
        jogador = Keyboard.nextLine();
    }

    public void IniciarJogo(){
        if(heroi != null){       //exige heroi instanciado
            String movimento;
            while(heroi.noJogo){
                Scanner Keyboard = new Scanner(System.in);
                movimento = Keyboard.nextLine();
                switch (movimento){
                    case "w":
                        Heroi.MoverParaCima();
                        break;
                    case "s":
                        Heroi.MoverParaBaixo();
                        break;
                    case "d":
                        Heroi.MoverParaDireita();
                        break;
                    case "k":
                        Heroi.AtivarFlecha();
                        break;
                    case "c":
                        Heroi.CapturarOuro();
                        break;
                    case "q":
                        Heroi.Sair();
                        break;
                }
                heroi.caverna.apresenta();
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
