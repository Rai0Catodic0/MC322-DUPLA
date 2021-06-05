package Tabuleiro;

import Itens.Item;
import Itens.NaveColonizadora;
import Itens.NaveGuerra;
import Itens.Satelite;
import Outros.Jogador;

public class Main {
    public static void main(String args[] ){
        IPlaneta p = new Planeta(0,0,0,"3");
        Jogador j = new Jogador(0);
        Item i = new NaveGuerra(0,0,'b',null);
        Item s = new Satelite(0,0,'s',null);
        p.addObserver(j);
        p.Inserir(i);
        System.out.println(j.pontuacao);
    }

}
