package mc322.lab06;

public class Wunpus extends Componente {
    boolean vivo;

    Wunpus(int x, int y, Caverna caverna) {
        super(x, y, caverna);
        vivo = true;
        criarFedor();
        caverna.Inserir(this.x, this.y , this);
    }
    public void criarFedor(){
        int esq = x-1;
        int dir = x+1;
        int cima = y-1;
        int baixo = y+1;
        if(esq>-1 && esq < 4){
            Fedor f1 = new Fedor(esq,y, caverna);
        }
        if(dir>-1 && dir < 4){
            Fedor f2 = new Fedor(dir,y,caverna);
        }
        if(cima>-1 && cima < 4){
            Fedor f3 = new Fedor(x,cima,caverna);
        }
        if(baixo>-1 && baixo<4){
            Fedor f4 = new Fedor(x,baixo,caverna);
        }
    }
}