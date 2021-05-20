package mc322.lab06;

public class Fedor extends Componente {
    public Fedor(int x, int y, Caverna caverna){
        super(x,y,caverna);
        this.caverna.Inserir(x,y,this);
    }
//    public void Remover(){
//        caverna.salas[this.y][this.x].Remover(this);
//        System.out.println("vou remover o fedor da sala "+this.y+" "+this.x);
//    }
}
