package Tabuleiro;

import Itens.Item;

public interface IComunicacaoJogador extends ITabuleiro{

    //FIXME:
    // - arrumar os parametros dos metodos
    // - discutir oq o moviemntar recebe
    Item Inserir();
    void Movimentar();
    void Lutar();
}
