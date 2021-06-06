package Tabuleiro;

import Itens.Item;
import Outros.Jogador;
import Recursos.*;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Planeta extends Observable implements IPlaneta{

    int i;
    int j;
    int id;
    public List<Item> itens = new ArrayList<>();
    String type;
    private BufferedImage sprite;

    public Planeta(int i, int j, int id, String  type) {
        this.i = i;
        this.j = j;
        this.id = id;
        this.type = type;

    }

    @Override
    public void Remover() {
        //TODO implement remover()
    }

    @Override
    public void Inserir(Item item) {
        itens.add(item);
        setChanged();
        notifyObservers(item);
    }

    @Override
    public Recursos GerarRecursos() {
        Recursos result = null;
        switch (this.type){
            case "mi":
                result = new Mineral();
                break;
            case "mu":
                result = new Municao();
                break;
            case "co":
                result = new Combustivel();
                break;
        }
        return result;
    }

    public void Renderizar(Graphics g) {
       //TO DO Comṕonente se renderizar
    }


    @Override
    public void addObserver(Jogador j) {
        super.addObserver(j);
    }
}
