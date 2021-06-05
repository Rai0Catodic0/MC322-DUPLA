package Outros;

import Itens.Item;
import Itens.NaveColonizadora;
import Itens.NaveGuerra;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Jogador implements Observer {
    public int pontuacao;
    public List<Item> items;

    public Jogador(int pontuacao){
        this.pontuacao = pontuacao;
        items = new ArrayList<>();
    }
    public boolean Mover(){
        return true;
    }

    public boolean Construir(){
        return false;
    }

    public void Destruir(){

    }

    @Override
    public void update(Observable observable, Object o) {
        Item item = (Item) o;
        this.items.add(item);
        if(item instanceof NaveColonizadora){
            this.pontuacao +=1;
        }
        else if(item instanceof NaveGuerra){
            this.pontuacao += 2;
        }
        else{
            this.pontuacao +=3;
        }
    }
}
