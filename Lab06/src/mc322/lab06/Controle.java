package mc322.lab06;

import java.util.Scanner;

public class Controle {

    Heroi heroi = null;      //ponteiro do heroi que será controlado
    int pontuacao = 0;
    String jogador;

    Controle(Heroi heroi){
        this.heroi = heroi;
    }


    public void IniciarJogo(){
        String movimento = null;
        Scanner Keyboard = new Scanner(System.in);
        jogador = Keyboard.nextLine();
        if(heroi != null){       //exige heroi instanciado
            while(heroi.noJogo){
                movimento = Keyboard.nextLine();
                switch (movimento){
                    case "w":
                        heroi.mover(heroi.x-1, heroi.y);
                        break;
                    case "s":
                        heroi.mover(heroi.x+1, heroi.y);
                        break;
                    case "d":
                        heroi.mover(heroi.x, heroi.y+1);
                        break;
                    case "a":
                        heroi.mover(heroi.x, heroi.y-1);
                        break;
                    case "k":
                        heroi.AtivarFlecha();
                        break;
                    case "c":
                        heroi.CapturarOuro();
                        break;
                    case "q":
                        heroi.noJogo = false;
                        break;
                    default:
                        System.out.println("Movimento Inválido! Veja as opções:");
                        System.out.println(
                                "● w -> Ir para a sala acima;\n" +
                                "● s -> Ir para a sala abaixo;\n" +
                                "● d -> Ir para a sala a direita;\n" +
                                "● a -> Ir para a sala a esquerda;\n" +
                                "● k -> Equipar a flecha;\n" +
                                "● c -> Capturar o ouro;\n" +
                                "● q -> Sair do jogo;"
                        );
                }
                System.out.print(heroi.caverna.apresenta());
                System.out.println("Player: "+jogador);
                System.out.println("Score: "+heroi.pontos);
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