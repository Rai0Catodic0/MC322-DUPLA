package mc322.lab06;

public class Caverna {
    Salas salas[][] = new Salas[4][4];

    public String apresenta(){
        char saida[] = new char[20];
        int k = 0;
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                saida[k]= salas[i][j].representacao;
                k++;
            }
            saida[k] = '\n';
            k++;
        }
        return  new String(saida);
    }
}
