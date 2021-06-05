package Tabuleiro;

import Itens.Item;;
import Recursos.*;

import java.util.ArrayList;
import java.util.List;

public class Planeta implements IPlaneta{

    int i;
    int j;
    int id;
    List<Item> itens = new ArrayList<>();
    String type;

    public Planeta(int i, int j, int id, String  type) {
        this.i = i;
        this.j = j;
        this.id = id;
        this.type = type;
    }

    @Override
    public void Remover() {

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

    public void Inserir(Item item){
        System.out.println("coloquei item!");
        itens.add(item);
    }
}
