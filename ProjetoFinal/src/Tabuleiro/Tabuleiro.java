package Tabuleiro;

import Itens.Item;
import java.util.List;


import Itens.NaveColonizadora;
import Itens.Satelite;

import java.util.Random;

public class Tabuleiro {

    private Planeta[][] planetas;

    public Tabuleiro() {

        //Instanciar Planetas
        planetas = InstanciarPlanetas();

        //Definir Posição dos Jogadores
        int posicaoJogador1[] = SortearPosicaoJogador();
        int posicaoJogador2[] = {-1,-1};
        do{
            posicaoJogador2 = SortearPosicaoJogador();
        } while (posicaoJogador1[0]==posicaoJogador2[0] && posicaoJogador1[1]==posicaoJogador2[1]);

        //Instanciar Itens para jogadores
        Item nave1 = new NaveColonizadora(posicaoJogador1[0], posicaoJogador1[1], 'C',this);
        Item satelite1 = new Satelite(posicaoJogador1[0], posicaoJogador1[1], 'C',this);
        Item nave2 = new NaveColonizadora(posicaoJogador2[0], posicaoJogador2[1], 'C',this);
        Item satelite2 = new Satelite(posicaoJogador2[0], posicaoJogador2[1], 'C',this);

        //Colocar Itens no tabuleiro
       /* this.Inserir(nave1);
        this.Inserir(nave2);
        this.Inserir(satelite1);
        this.Inserir(satelite2);
        */
        //Instanciar Jogadores em suas posições
        Jogador jogador1 = new Jogador(posicaoJogador1[0], posicaoJogador1[1]);
        Jogador jogador2 = new Jogador(posicaoJogador2[0], posicaoJogador2[1]);

        //Atualizar itens dos jogadores
        jogador1.setItens(nave1, satelite1);
        jogador2.setItens(nave2, satelite2);
    }

    /**Funções auxiliares do Construtor**/

    private String SortearPlaneta(){
        int metal=0;
        int municao = 0;
        int combustivel=0;
        Random sortear = new Random();
        int sorteado = sortear.nextInt(3);
        System.out.println(sorteado);
        if(sorteado==0){
            return "metal";
        }
        else if(sorteado==1){
            return "combustivel";
        }
        else {
            return "municao";
        }
    }

    private Planeta[][] InstanciarPlanetas(){

        Planeta planetas[][] = new Planeta[5][5];

        for(int i = 0; i<5; i++){
            for(int j = 0; j<5;j++){
                planetas[i][j]=null;
            }
        }
        planetas[0][1] = new Planeta(0,1,475,620,1,SortearPlaneta());
        planetas[0][2] = new Planeta(0,2,300,800,2,SortearPlaneta());
        planetas[0][3] = new Planeta(0,3,140,1224,3,SortearPlaneta());
        planetas[1][0] = new Planeta(1,0,320,1224,4,SortearPlaneta());
        planetas[1][2] = new Planeta(1,2,590,1234,5,SortearPlaneta());
        planetas[1][4] = new Planeta(1,4,720,810,6,SortearPlaneta());
        planetas[2][0] = new Planeta(2,0,820,1150,7,SortearPlaneta());
        planetas[2][1] = new Planeta(2,1,0,700,8,SortearPlaneta());
        planetas[2][3] = new Planeta(2,3,0,800,9,SortearPlaneta());
        planetas[2][4] = new Planeta(2,4,0,900,10,SortearPlaneta());
        planetas[3][0] = new Planeta(3,0,100,0,11,SortearPlaneta());
        planetas[3][2] = new Planeta(3,2,100,100,12,SortearPlaneta());
        planetas[3][4] = new Planeta(3,4,100,200,13,SortearPlaneta());
        planetas[4][1] = new Planeta(4,1,100,300,14,SortearPlaneta());
        planetas[4][2] = new Planeta(4,2,100,400,15,SortearPlaneta());
        planetas[4][3] = new Planeta(4,3,100,500,16,SortearPlaneta());
        return planetas;

    }

    private int[] SortearPosicaoJogador(){
        int colunas1[] = {1,2,3};
        int colunas2[] = {0,2,4};
        int colunas3[] = {0,1,3,4};
        Random sortear = new Random();
        int sorteadoLinha = sortear.nextInt(5);
        int sorteadoColuna;
        if(sorteadoLinha==2){
            sorteadoColuna = colunas3[sortear.nextInt(4)];
        } else if(sorteadoLinha==0 || sorteadoLinha==4) {
            sorteadoColuna = colunas1[sortear.nextInt(3)];
        } else {
            sorteadoColuna = colunas2[sortear.nextInt(3)];
        }
        return new int[] {sorteadoLinha, sorteadoColuna};
    }


    /**Funções ativas no Jogo*/

    public void Inserir(Item item){
        this.planetas[item.i][item.j].Inserir(item);
    }

    public void Remover(Item item) {
        List<Integer> position = item.getPosition();
        this.planetas[position.get(0)][position.get(0)].Remover(item);

    }

    public Planeta[][] getPlanetas() {
        return planetas;
    }
}
