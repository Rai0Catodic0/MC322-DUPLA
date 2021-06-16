package Tabuleiro;

import Itens.Item;
import Itens.NaveColonizadora;
import Itens.NaveGuerra;
import Recursos.Recursos;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Jogador {
    public int pontuacao;
    public List<Item> itens;

    public Jogador(){
        this.pontuacao = 0;
        itens = new ArrayList<>();
    }

    public void setItens(Item nave, Item satelite){
        this.itens.add(nave);
        this.itens.add(satelite);
    }

    public boolean Mover(){
        //TODO implementar mover
        return true;
    }

    public boolean Construir(){
        //TODO implementar Construir
        return false;
    }

    public void Destruir(){
        //TODO implementar destruir
    }

//    @Override
//    public void update(Observable observable, Object o) {
//        Item item = (Item) o;
//        this.itens.add(item);
//        if(item instanceof NaveColonizadora){
//            this.pontuacao +=1;
//        }
//        else if(item instanceof NaveGuerra){
//            this.pontuacao += 2;
//        }
//        else{
//            this.pontuacao +=3;
//        }
//    }

    public int[] status(){
        //metal,municao,combustivel,satelite,guerra,colonizacao
        int[] saida = new int[6];
        Item item = itens.get(0);
        for(Recursos r : item.getColetados()){
            String tipo = r.gettype();
            switch (tipo){
                case "Mineral":
                    saida[0]++;
                    break;
                case "Municao":
                    saida[1]++;
                    break;
                case "combustivel":
                    saida[2]++;
                default:
                    break;
            }
        }
        for(Item i : itens){
            String s = i.getType();
            switch (s){
                case "satelite":
                    saida[3]++;
                    break;
                case "naveguerra":
                    saida[4]++;
                    break;
                case "navecolonizadora":
                    saida[5]++;
                    break;
            }
        }
        return  saida;
    }
}
