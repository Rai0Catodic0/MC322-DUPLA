package Tabuleiro;

import Itens.Item;
import Itens.NaveColonizadora;
import Itens.NaveGuerra;
import Outros.Jogador;
import Recursos.*;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Planeta extends Observable implements IPlaneta{
    int i;
    int j;
    int ipixels;
    int jpixels;
    int id;
    public List<Item> itens = new ArrayList<>();
    String type;
    String imgpath;

    public String getImgpath() {
        return imgpath+".png";
    }

    public int[] getPixelsPosition() {
        return new int[]{ipixels, jpixels};
    }

    public int getI(){
        return  i;
    }

    public int getJ(){
        return j;
    }


    public Planeta(int i, int j, int ipixels, int jpixels, int id, String  type) {
        this.i = i;
        this.j = j;
        this.ipixels = ipixels;
        this.jpixels = jpixels;
        this.id = id;
        this.type = type;
        int imgNumber = new Random().nextInt(2);
        this.imgpath = "images/planeta"+type+ 1;

    }

    @Override
    public void Remover(Item item) {
        this.itens.remove(item);
    }

    public List<Item> getItens() {
        return itens;
    }

    @Override
    public void Inserir(Item item) {
        itens.add(item);
        //FIXME hardcoded string , mudar pra concatenacao
        //this.imgpath = "images/planetacombustivel1nave";
        setChanged();
        notifyObservers(item);
    }

    @Override
    public Recursos GerarRecursos() {
        Recursos result = null;
        switch (this.type){
            case "metal":
                result = new Mineral();
                break;
            case "municao":
                result = new Municao();
                break;
            case "combustivel":
                result = new Combustivel();
                break;
        }
        return result;
    }

    public boolean Mover(Item item){
        //Faz a lógica de mover e faz a lógica da luta
        Inserir(item);
        return true;
    }



    @Override
    public void addObserver(Jogador j) {
        super.addObserver(j);
    }
}
