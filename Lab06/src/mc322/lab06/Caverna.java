package mc322.lab06;

public class Caverna {
    private Salas salas[][] = new Salas[4][4];
    Heroi heroi = null;
    Wumpus wunpus = null;
    Ouro ouro = null;
    Buraco buraco1 = null;
    Buraco buraco2 = null;
    Buraco buraco3 = null;

    Caverna(){
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                salas[i][j] = new Salas(null, null, null, null,i,j);
            }
        }
    }

    public String apresenta(){
        char saida[] = new char[30];
        int k = 0;
        char indices[] = {'1','2','3','4'};
        for(int i = 0; i<4; i++){
            saida[k] = indices[i];
            k++;
            for(int j = 0; j<4; j++){
                if(salas[i][j].visitada) {
                    saida[k] = salas[i][j].representacao;
                } else {
                    saida[k] = '-';
                }
                k++;
            }
            saida[k] = '\n';
            k++;
        }
        saida[k]=' ';
        k++;
        for(int i=0; i<4; i++){
            saida[k]= indices[i];
            k++;
        }
        saida[k]='\n';
        return  new String(saida);
    }
    public int lutarComWumpus(int x, int y, boolean armado){
        int resultado = this.salas[x][y].wunpus.lutarComHeroi(armado);
        if(resultado==0){
            this.salas[x][y].Remover(salas[x][y].wunpus);
        }
        return resultado;
    }

    public void Inserir(int x, int y, Buraco buraco){
        salas[x][y].Inserir(buraco);
    }

    public void Inserir(int x, int y, Heroi heroi){
        salas[x][y].Inserir(heroi);
    }

    public boolean ExisteBuraco(int x, int y){
        if(this.salas[x][y].buraco!=null){
            return true;
        } else {
            return false;
        }
    }

    public boolean ExisteWumpus(int x, int y){
        if(this.salas[x][y].wunpus!=null){
            return true;
        } else {
            return false;
        }
    }

    public boolean ExisteOuro(int x, int y){
        if(this.salas[x][y].ouro!=null){
            return true;
        } else {
            return false;
        }
    }

    public void Inserir(int x, int y, Wumpus wunpus){
        salas[x][y].Inserir(wunpus);
    }

    public void Inserir(int x, int y, Ouro ouro){
        salas[x][y].Inserir(ouro);
    }

    public void Inserir(int x, int y, Brisa brisa){
        salas[x][y].Inserir(brisa);
    }

    public void Inserir(int x, int y, Fedor fedor){
        salas[x][y].Inserir(fedor);
    }

    public void Remover(int x, int y, Heroi heroi){
        this.salas[x][y].Remover(salas[x][y].heroi);
    }

    public void Remover(int x, int y, Fedor fedor){
        this.salas[x][y].Remover(salas[x][y].fedor);
    }

    public void Remover(int x, int y, Ouro ouro){
        this.salas[x][y].Remover(salas[x][y].ouro);
    }
    public void Remover(int x, int y, Wumpus wunpus){
        this.salas[x][y].Remover(salas[x][y].wunpus);
    }
    public void Remover(int x, int y){
        this.salas[x][y].Remover(salas[x][y].ouro);
    }

}

