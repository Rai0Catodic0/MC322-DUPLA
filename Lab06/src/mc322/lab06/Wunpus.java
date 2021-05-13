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
        if(x==0){
            if(y==0){
                Fedor f1 = new Fedor(this.x+1,this.y,caverna);
                Fedor f2 = new Fedor(this.x,this.y+1,caverna);
                caverna.Inserir(f1.x, f1.y, f1);
                caverna.Inserir(f2.x, f2.y, f2);
            }
            else if(y==3){
                Fedor f1 = new Fedor(this.x,this.y-1,caverna);
                Fedor f2 = new Fedor(this.x+1,this.y,caverna);
                caverna.Inserir(f1.x, f1.y,  f1);
                caverna.Inserir(f2.x, f2.y, f2);

            }
        }
        else if(x==3){
            if(y==0){
                Fedor f1 = new Fedor(this.x-1,this.y,caverna);
                Fedor f2 = new Fedor(this.x,this.y+1,caverna);
                caverna.Inserir(f1.x, f1.y,  f1);
                caverna.Inserir(f2.x, f2.y, f2);
            }
            else if(y==3){
                Fedor f1 = new Fedor(this.x,this.y-1, caverna);
                Fedor f2 = new Fedor(this.x-1, this.y, caverna);
                caverna.Inserir(f1.x,f1.y,f1);
                caverna.Inserir(f2.x, f2.y, f2);
            }
        }        else if(y==0){
            Fedor f1 = new Fedor(this.x-1, this.y, caverna);
            Fedor f2 = new Fedor(this.x, this.y+1, caverna);
            Fedor f3 = new Fedor(this.x+1, this.y, caverna);
            caverna.Inserir(f1.x, f1.y, f1);
            caverna.Inserir(f2.x, f2.y, f2);
            caverna.Inserir(f3.x, f3.y, f3);
        }
        else if(y==3){
            Fedor f1 = new Fedor(this.x-1, this.y, caverna);
            Fedor f2 = new Fedor(this.x, this.y-1, caverna);
            Fedor f3 = new Fedor(this.x+1, this.y, caverna);
            caverna.Inserir(f1.x, f1.y, f1);
            caverna.Inserir(f2.x, f2.y, f2);
            caverna.Inserir(f3.x, f3.y, f3);
        }
        else{
            Fedor f1 = new Fedor(this.x-1, this.y, caverna);
            Fedor f2 = new Fedor(this.x, this.y-1, caverna);
            Fedor f3 = new Fedor(this.x+1, this.y, caverna);
            Fedor f4 = new Fedor(this.x, this.y+1, caverna);
            caverna.Inserir(f1.x, f1.y, f1);
            caverna.Inserir(f2.x, f2.y, f2);
            caverna.Inserir(f3.x, f3.y, f3);
            caverna.Inserir(f4.x, f4.y, f4);
        }
    }
}