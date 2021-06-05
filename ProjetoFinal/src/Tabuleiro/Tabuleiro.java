package Tabuleiro;

import Itens.Item;

public class Tabuleiro implements ITabuleiro {
    public Planeta[][] planetas;
    public Tabuleiro(Planeta[][] matrix) {
        this.planetas = matrix;
    }

    @Override
    public String Apresentar() {
        for(int i =0; i<5; i++){
            for(int j = 0; j<5; j++){
                if(planetas[i][j]!=null && planetas[i][j].itens.size()>0 ){
                    System.out.println("Vou printar!");
                    System.out.print(planetas[i][j].itens.get(0).representacao+" "+planetas[i][j].itens.get(1).representacao);
                }
            }
        }
        return "oi";
    }

    @Override
    public void Remover() {

    }

    @Override
    public void Movimentar() {

    }

    @Override
    public void Lutar() {

    }

    public void Inserir(Item item) {
        System.out.println("ESSE É O PLANETA EM"+item.i+item.j+this.planetas[item.i][item.j]);
        this.planetas[item.i][item.j].Inserir(item);
    }
}
