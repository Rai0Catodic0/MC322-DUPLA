package Tabuleiro;

import Itens.Item;
import Outros.Jogador;
import Recursos.Recursos;
import java.util.Observable;

public interface IPlaneta {
    void Remover();
    void Inserir(Item item);
    Recursos GerarRecursos();

    void addObserver(Jogador j);
}
