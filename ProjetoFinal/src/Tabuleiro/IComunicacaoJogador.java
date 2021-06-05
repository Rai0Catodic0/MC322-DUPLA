package Tabuleiro;

import Itens.Item;

public interface IComunicacaoJogador extends ITabuleiro{
    Item Inserir();
    void Movimentar();
    void Lutar();
}
