package Tabuleiro;

import Itens.Item;

public class Tabuleiro implements ITabuleiro {
    Planeta[][] matrix;
    public Tabuleiro(Planeta[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public String Apresentar() {
        for(int i =0; i<5; i++){
            for(int j = 0; j<5; j++){
                if(matrix[i][j]!=null && matrix[i][j].itens.size()>0 ){
                    System.out.println("Vou printar!");
                    System.out.print(matrix[i][j].itens.get(0).representacao+" "+matrix[i][j].itens.get(1).representacao);
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
        System.out.println("ESSE É O PLANETA EM"+item.i+item.j+this.matrix[item.i][item.j]);
        this.matrix[item.i][item.j].Inserir(item);
    }
}
