package mc322.lab06;

import java.util.Random;
public class Wunpus extends Componente {
    boolean vivo;
    Fedor f1 = null, f2 = null, f3 = null, f4 = null;

    Wunpus(int x, int y, Caverna caverna) {
        super(x, y, caverna);
        vivo = true;
        criarFedor();
        caverna.Inserir(this.x, this.y , this);
    }

    private void RetirarBrisas(){
        if(f1!=null) {
            this.caverna.Remover(this.f1.x, this.f1.y, this.f1);
        }
        if(f2!=null) {
            this.caverna.Remover(this.f2.x, this.f2.y, this.f2);
        }
        if(f3!=null) {
            this.caverna.Remover(this.f3.x, this.f3.y, this.f3);
        }
        if(f4!=null) {
            this.caverna.Remover(this.f4.x, this.f4.y, this.f4);
        }
    }

    public int lutarComHeroi(boolean flecha){
        if(flecha){
            Random random = new Random();
            if(50<=random.nextInt(100)){
                RetirarBrisas();
                return 0;
            }
        }
        return 1;
    }

    public void criarFedor(){
        int esq = x-1;
        int dir = x+1;
        int cima = y-1;
        int baixo = y+1;
        if(esq>-1 && esq < 4){
            f1 = new Fedor(esq,y, caverna);
        }
        if(dir>-1 && dir < 4){
            f2 = new Fedor(dir,y,caverna);
        }
        if(cima>-1 && cima < 4){
            f3 = new Fedor(x,cima,caverna);
        }
        if(baixo>-1 && baixo<4){
            f4 = new Fedor(x,baixo,caverna);
        }
    }

}