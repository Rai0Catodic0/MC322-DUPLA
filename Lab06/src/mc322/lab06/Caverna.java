package mc322.lab06;

public class Caverna {
    Salas salas[][] = new Salas[4][4];
    Heroi heroi = null;
    Wunpus wunpus = null;
    Ouro ouro = null;
    Buraco buraco1 = null;
    Buraco buraco2 = null;
    Buraco buraco3 = null;

    Caverna(){
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                salas[i][j] = new Salas(null, null, null, null);
            }
        }
    }

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

    public void Inserir(int x, int y, Buraco buraco){
        salas[y][x].Inserir(buraco);
    }

    public void Inserir(int x, int y, Heroi heroi){
        salas[y][x].Inserir(heroi);
    }

    public void Inserir(int x, int y, Wunpus wunpus){
        salas[y][x].Inserir(wunpus);
    }

    public void Inserir(int x, int y, Ouro ouro){
        salas[y][x].Inserir(ouro);
    }

    public void Inserir(int x, int y, Brisa brisa){
        salas[y][x].Inserir(brisa);
    }

    public void Inserir(int x, int y, Fedor fedor){
        salas[y][x].Inserir(fedor);
    }

}
