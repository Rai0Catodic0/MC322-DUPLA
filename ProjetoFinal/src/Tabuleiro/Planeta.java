package Tabuleiro;

import App.Spritesheet;
import Itens.Item;
import Outros.Jogador;
import Recursos.*;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Planeta extends Observable implements IPlaneta{
    private BufferedImage ImagemPlaneta;
    private Spritesheet spritesheet;

    //VERMELHO COM ANEL
    private int XPLANETA1 = 133;
    private int yPLANETA1 = 12;
    private int LARGURA_PLANETA1 = 105;
    private int ALTURA_PLANETA1 = 95;

    //AZUL COM BURAQUINHO
    private int XPLANETA2 = 259;
    private int yPLANETA2 = 18;
    private int LARGURA_PLANETA2 = 105;
    private int ALTURA_PLANETA2 = 95;

    //INTEIRO VERMELHO ESCURO
    private int XPLANETA3 = 386;
    private int yPLANETA3 = 13;
    private int LARGURA_PLANETA3 = 104;
    private int ALTURA_PLANETA3 = 102;

    //TERRA
    private int XPLANETA4 = 512;
    private int yPLANETA4 = 13;
    private int LARGURA_PLANETA4 = 104;
    private int ALTURA_PLANETA4 = 102;

    //VERMELHO CLARO
    private int XPLANETA5 = 133;
    private int yPLANETA5 = 139;
    private int LARGURA_PLANETA5 = 104;
    private int ALTURA_PLANETA5 = 102;

    //ROSA COM ANEL PONTILHADO
    private int XPLANETA6 = 385;
    private int yPLANETA6 = 133;
    private int LARGURA_PLANETA6 = 104;
    private int ALTURA_PLANETA6 = 102;

    //VERDE COM ANEL
    private int XPLANETA7 = 132;
    private int yPLANETA7 = 272;
    private int LARGURA_PLANETA7 = 110;
    private int ALTURA_PLANETA7 = 90;

    //AZUL MAIS ESCURO
    private int XPLANETA8 = 256;
    private int yPLANETA8 = 386;
    private int LARGURA_PLANETA8 = 110;
    private int ALTURA_PLANETA8 = 105;

    //VERDE PONTUDO
    private int XPLANETA9 = 382;
    private int yPLANETA9 = 386;
    private int LARGURA_PLANETA9 = 110;
    private int ALTURA_PLANETA9 = 105;

    //PLANETA AZUL COM SATELITES
    private int XPLANETA10 = 511;
    private int yPLANETA10 = 264;
    private int LARGURA_PLANETA10 = 110;
    private int ALTURA_PLANETA10 = 107;



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
        spritesheet = new Spritesheet("planetas.png");
        if(type=="metal"){
            ImagemPlaneta = spritesheet.getSpritesheet(XPLANETA7,yPLANETA7,LARGURA_PLANETA7,ALTURA_PLANETA7);
        } else if(type=="municao"){
            ImagemPlaneta = spritesheet.getSpritesheet(XPLANETA3,yPLANETA3,LARGURA_PLANETA3,ALTURA_PLANETA3);
        } else if(type=="combustivel"){
            ImagemPlaneta = spritesheet.getSpritesheet(XPLANETA8,yPLANETA8,LARGURA_PLANETA8,ALTURA_PLANETA8);
        }

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
        System.out.println("AQUIIIIIIII");
        int xPixel = 0, yPixel = 0;
        if(this.i!=0){
            xPixel = i*120;
        }
        if(this.j!=0){
            yPixel = j*120;
        }
        g.drawImage(ImagemPlaneta, xPixel,yPixel, null);
    }


    @Override
    public void addObserver(Jogador j) {
        super.addObserver(j);
    }
}
