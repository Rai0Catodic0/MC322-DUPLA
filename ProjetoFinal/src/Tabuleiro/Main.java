package Tabuleiro;

import Itens.Item;
import Itens.NaveColonizadora;
import Itens.NaveGuerra;
import Itens.Satelite;
import Outros.Jogador;

import java.util.List;

public class Main {
    public static void main(String args[] ){
        IPlaneta p = new Planeta(0,0,0,"3");
        Item n = new NaveGuerra(0,0,'a',null);
        p.Inserir(n);
        List<Item> i = p.getItens();
        System.out.println(i.size());
        i = p.getItens();
        System.out.println(i.size());
    }

}
