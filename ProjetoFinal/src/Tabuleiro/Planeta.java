package Tabuleiro;

import Itens.Item;
import Itens.NaveColonizadora;
import Itens.NaveGuerra;
import Itens.Satelite;
import Recursos.*;
import testefx.Tile;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Planeta  implements IPlaneta {
    int i;
    int j;
    int ipixels;
    int jpixels;
    int id;
    int[] idVizinhos;
    Tile tile;
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
        //this.idVizinhos = idVizinhos;
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
    }

    public void Inserir(String itemInseridoString, Item itemInserido) {
        Inserir(itemInserido);
        tile.update(itens);
        System.out.println("INSERIR "+id);
    }

    public Item Remover(String itemRemovido) {
        System.out.println("Essa é a lista do planeta " + this +"antes de remover :"+itens);
        Item itemRemoverI = null;
        if(itemRemovido.equals("naveColonizadora")){
            for(Item item : itens){
                if(item instanceof NaveColonizadora){
                    itemRemoverI = item;
                    break;
                }
            }
        }
        Remover(itemRemoverI);
        tile.update(itens);
        System.out.println("Essa é a lista do planeta " + this +"depois de remover :"+itens);
        return itemRemoverI;
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

    public void setTile(Tile tile){
        this.tile = tile;
        tile.setImgpath(this.getImgpath());
        tile.setPositionsPixels(this.getPixelsPosition());
        tile.setItems(this.getItens());
        tile.setPlanetaId(id);
        tile.IniciarTile();
    }


    public void setIdVizinhos(int[] idVizinhos) {
        this.idVizinhos = idVizinhos;
    }
    public boolean  isVizinho(int idVizinho){
        boolean is = false;
        System.out.println(is);
        System.out.println(this.idVizinhos.length);
        for(int i = 0 ; i<this.idVizinhos.length; i++){
            if(idVizinho==this.idVizinhos[i]){
                is = true;
                break;
            }
        }
        return is;
    }

    public void Construir(String objeto){

    }

}
