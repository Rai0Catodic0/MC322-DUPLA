package mc322.lab06;

public class Buraco  extends  Componente{
    Buraco(int x, int y, Caverna caverna){
        super(x, y, caverna);
        criaBriza();
        caverna.salas[x][y].buraco = this;
    }
    public void criaBriza(){
        if(x==0){
            if(y==0){
                Brisa b1 = new Brisa(0,1, caverna);
                Brisa b2 = new Brisa(1,0,caverna);
                //aqui ou na brisa ???????
            }
            else if(y==3){
                Brisa b1 = new Brisa(0,2, caverna);
                Brisa b2 = new Brisa(1,3,caverna);
                caverna.salas[b1.x][b1.y].brisa = b1;
                caverna.salas[b2.x][b2.y].brisa = b2;
            }
            else{
                Brisa b1 = new Brisa(this.x, this.y-1, caverna);
                Brisa b2 = new Brisa(this.x-1,this.y, caverna);
                Brisa b3 = new Brisa(this.x, this.y+1,caverna);
                caverna.salas[b1.x][b1.y].brisa = b1;
                caverna.salas[b2.x][b2.y].brisa = b2;
                caverna.salas[b3.x][b3.y].brisa = b3;
            }
        }
        else if(x==3){
            if(y==0){
                Brisa b1 = new Brisa(2,0,caverna);
                Brisa b2 = new Brisa(3,1,caverna);
                caverna.salas[b1.x][b1.y].brisa = b1;
                caverna.salas[b2.x][b2.y].brisa = b2;
            }
            else if(y==3){
                Brisa b1 = new Brisa(2,3,caverna);
                Brisa b2 = new Brisa(3,2,caverna);
                caverna.salas[b1.x][b1.y].brisa = b1;
                caverna.salas[b2.x][b2.y].brisa = b2;
            }
            else {
                Brisa b1 = new Brisa(this.x,this.y-1,caverna);
                Brisa b2 = new Brisa(this.x-1,this.y,caverna);
                Brisa b3 = new Brisa(this.x,this.y+1,caverna);
                caverna.salas[b1.x][b1.y].brisa = b1;
                caverna.salas[b2.x][b2.y].brisa = b2;
                caverna.salas[b3.x][b3.y].brisa = b3;
            }
        }
    }
}
