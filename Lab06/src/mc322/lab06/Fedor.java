package mc322.lab06;

public class Fedor extends Componente {
    public Fedor(int x, int y, Caverna caverna) {
        super(x, y, caverna);
        this.caverna.Inserir(x, y, this);
    }
}
