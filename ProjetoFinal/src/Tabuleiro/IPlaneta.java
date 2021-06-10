package Tabuleiro;

import Itens.Item;
import Outros.Jogador;
import Recursos.Recursos;

import java.util.List;
import java.util.Observable;

public interface IPlaneta {
    void Remover(Item item);
    void Inserir(Item item);
    Recursos GerarRecursos();
    List<Item> getItens();
    void addObserver(Jogador j);
}
