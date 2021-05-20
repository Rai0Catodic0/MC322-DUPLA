package mc322.lab06;

public class Buraco  extends  Componente{
    Buraco(int x, int y, Caverna caverna){
        super(x, y, caverna);
        System.out.println(x+" "+y);
        criaBriza();
        caverna.Inserir(x,y, this);

    }
    public void criaBriza(){
        int esq = x-1;
        int dir = x+1;
        int cima = y-1;
        int baixo = y+1;
        if(esq>-1 && esq < 4){
            Brisa b1 = new Brisa(esq,y, caverna);
        }
        if(dir>-1 && dir < 4){
            Brisa b2 = new Brisa(dir,y,caverna);
        }
        if(cima>-1 && cima < 4){
            Brisa b3 = new Brisa(x,cima,caverna);
        }
        if(baixo>-1 && baixo<4){
            Brisa b4 = new Brisa(x,baixo,caverna);
        }
    }
}
