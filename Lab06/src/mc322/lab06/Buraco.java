package mc322.lab06;

public class Buraco  extends  Componente{
    Buraco(int x, int y, Caverna caverna){
        super(x, y, caverna);
        criaBriza();
        this.caverna.Inserir(x,y,this);
    }
    public void criaBriza(){
        if(x==0){
            if(y==0){
                Brisa b1 = new Brisa(0,1, caverna);
                Brisa b2 = new Brisa(1,0,caverna);
                //falta colocar na salas
            }
            else if(y==3){
                Brisa b1 = new Brisa(0,2, caverna);
                Brisa b2 = new Brisa(1,3,caverna);
                //falta colocar na salas
            }
            else{
                Brisa b1 = new Brisa(this.x, this.y-1, caverna);
                Brisa b2 = new Brisa(this.x-1,this.y, caverna);
                Brisa b3 = new Brisa(this.x, this.y+1,caverna);
            }
        }
        else if(x==3){
            if(y==0){
                Brisa b1 = new Brisa(2,0,caverna);
                Brisa b2 = new Brisa(3,1,caverna);
            }
            else if(y==3){
                Brisa b1 = new Brisa(2,3,caverna);
                Brisa b2 = new Brisa(3,2,caverna);
            }
            else {
                Brisa b1 = new Brisa(this.x,this.y-1,caverna);
                Brisa b2 = new Brisa(this.x-1,this.y,caverna);
                Brisa b3 = new Brisa(this.x,this.y+1,caverna);
            }
        }
    }
}
