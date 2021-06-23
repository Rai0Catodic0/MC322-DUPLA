package View;


import Tabuleiro.Tabuleiro;
import Tabuleiro.Jogador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.text.Font;

import java.util.Random;

public class Controle {
    private Tabuleiro tab;
    private Jogador verde;
    private Jogador azul;
    private BarraLateral barraLateral;
    private boolean construiu = false;
    private boolean passouVez = false;
    private Group root;
    private Button botaoPassarVez;
    private int vez;
    //1 = azul
    //0 = verde


    public Controle(Tabuleiro tab, Group root) {
        this.tab = tab;
        verde = tab.getJogadorVerde();
        azul = tab.getJogadorAzul();
        barraLateral = new BarraLateral(root);
        this.root = root;
        botaoPassarVez = new Button();
        botaoPassarVez.setText("Paasar a vez");
        botaoPassarVez.setLayoutY(539.5);
        botaoPassarVez.setLayoutX(100);
        botaoPassarVez.setFont(Font.font("Verdana", 15));
        botaoPassarVez.getStylesheets().add(getClass().getResource("styleBotaoSelecao.css").toExternalForm());
        botaoPassarVez.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                TrocarVez();
            }
        });
        Random sortearInicio = new Random();
        vez = sortearInicio.nextInt(2);
        System.out.println("KKKKKKKKKKKKKKKKKKKKKKKKK vez do jogador: "+vez);
    }

    public void TrocarVez(){
        if(vez == 0){
            barraLateral.Esconder(verde);
            barraLateral.Desenhar(azul);
            vez = 1;
        } else if(vez == 1){
            barraLateral.Esconder(azul);
            barraLateral.Desenhar(verde);
            vez = 0;
        }
    }

    public int getVez(){
        return vez;
    }

    public Jogador getVezJogador(){
        if (getVez() == 1) {
            return azul;
        }
        return verde;
    }

    public void Construir(int planetaClicado, String objeto){
        tab.Construir(planetaClicado, objeto);
        if(JogoRodando()){
            TrocarVez();
        }
    }

    public void Mover(int planetaClicado, int planetaRecebeAcao, String objeto){
        tab.Mover(planetaClicado, planetaRecebeAcao, objeto);
        if(JogoRodando()){
            TrocarVez();
        }
    }

    private boolean JogoRodando(){
        if(azul.getQtdItens()<=0 || verde.getQtdItens()<=0 || azul.getPontuacao()>=12 || verde.getPontuacao()>=12){
            return false;
        }
        return true;
    }

    public void IniciarJogo(){
        root.getChildren().add(botaoPassarVez);
        barraLateral.IniciarBarra();
        barraLateral.Desenhar(getVezJogador());
    }

}
