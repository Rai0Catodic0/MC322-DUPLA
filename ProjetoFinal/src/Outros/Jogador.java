package Outros;

import Itens.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Jogador implements Observer {
    int pontuacao;
    List<Item> items = new ArrayList<>();

    public Jogador(int pontuacao){
        this.pontuacao = pontuacao;
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

    }
}
