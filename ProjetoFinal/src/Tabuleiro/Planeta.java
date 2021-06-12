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
        if(item instanceof NaveGuerra){
            System.out.println("tipo :guerra");
            this.imgpath = this.imgpath+ "nave";
        }else if(item instanceof NaveColonizadora){
            System.out.println("tipo :colonizadora");
            this.imgpath = this.imgpath+ "nave";
        }
        else {
            System.out.println("tipo :satelite");
            this.imgpath = this.imgpath+ "satelite";
        }
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



    @Override
    public void addObserver(Jogador j) {
        super.addObserver(j);
    }
}
