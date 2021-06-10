package Tabuleiro;

import Itens.Item;

import java.util.List;

public class Tabuleiro implements ITabuleiro {
    public Planeta[][] planetas;
    public Tabuleiro(Planeta[][] matrix) {
        this.planetas = matrix;
    }

    @Override
    public String Apresentar() {
        return null;
    }

    @Override
    public boolean Inserir(Item item) {
        return false;
    }

    @Override
    public void Remover(Item item) {
        List<Integer> position = item.getPosition();
        this.planetas[position.get(0)][position.get(0)].Remover(item);
    }

    @Override
    public void Movimentar() {

    }

    @Override
    public void Lutar() {

    }
}
