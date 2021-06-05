package App;

import Tabuleiro.Controle;
import Tabuleiro.Montador;

public class App {
    public static void main(String args[]){
        Montador montador = new Montador();
        Controle jogo1 = montador.MontarJogo();
        jogo1.IniciaJogo();
    }
}
