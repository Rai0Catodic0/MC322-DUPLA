package Tabuleiro;

import Itens.Item;
import Recursos.Recursos;

public interface IPlaneta {
    void Remover();
    void Inserir(Item item);
    Recursos GerarRecursos();
}
