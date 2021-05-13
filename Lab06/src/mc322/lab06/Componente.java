package mc322.lab06;

public class Componente {
    int x,y;
    Caverna caverna;
    Componente(int x,int y,Caverna caverna){
        if(x<0 || 3<x || y<0 || 3<y){
            IllegalArgumentException erro = new IllegalArgumentException();
            throw  erro;
        }else {
            this.x = x;
            this.y = y;
            this.caverna = caverna;
        }
    }

}
