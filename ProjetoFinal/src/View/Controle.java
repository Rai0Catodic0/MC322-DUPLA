package View;


import Tabuleiro.Tabuleiro;
import Tabuleiro.Jogador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.text.Font;

public class Controle {
    private Tabuleiro tab;
    private Jogador verde;
    private Jogador azul;
    private BarraLateral barraLateral;
    private boolean construiu = false;
    private boolean passouVez = false;
    private Group root;
    private Button botaoPassarVez;


    public Controle(Tabuleiro tab, BarraLateral barraLateral, Group root) {
        this.tab = tab;
        verde = tab.getJogadorVerde();
        azul = tab.getJogadorAzul();
        this.barraLateral = barraLateral;
        botaoPassarVez = new Button();
        botaoPassarVez.setText("Paasar a vez");
        botaoPassarVez.setLayoutY(539.5);
        botaoPassarVez.setLayoutX(300);
        botaoPassarVez.setFont(Font.font("Verdana", 15));
        botaoPassarVez.getStylesheets().add(getClass().getResource("styleBotaoSelecao.css").toExternalForm());
        botaoPassarVez.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                passouVez = true;
            }
        });
        root.getChildren().add(botaoPassarVez);

    }

    public void Construir(int planetaClicado, String objeto){
        tab.Construir(planetaClicado, objeto);
        if(!JogoRodando()){

        }
    }

    public void Mover(int planetaClicado, int planetaRecebeAcao, String objeto){
        tab.Mover(planetaClicado, planetaRecebeAcao, objeto);
        if(!JogoRodando()){

        }
    }

    private boolean JogoRodando(){
        if(azul.getQtdItens()<=0 || verde.getQtdItens()<=0 || azul.getPontuacao()>=12 || verde.getPontuacao()>=12){
            return false;
        }
        return true;
    }

//    public void IniciarJogo(){
//        boolean vezAzul = true;
//        boolean vezVerde = false;
//        while(azul.getQtdItens()>0 && verde.getQtdItens()>0 && azul.getPontuacao()<12 && verde.getPontuacao()<12){
//            if(vezAzul){
//                barraLateral.Desenhar(azul);
//                while(!construiu && !passouVez){
//                    //vez do jogador
//                    System.out.println("VEZ DO AZUL");
//                }
//            } else {
//                barraLateral.Desenhar(verde);
//                while(!construiu && !passouVez){
//                    //vez do jogador
//                    System.out.println("VEZ DO VERDE");
//                }
//            }
//            vezAzul = !vezAzul;
//            vezVerde = !vezVerde;
//           construiu = false;
//            passouVez = false;
//        }
//    }
}
