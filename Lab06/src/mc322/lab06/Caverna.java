package mc322.lab06;

public class Caverna {
    private Salas salas[][] = new Salas[4][4];
    Heroi heroi = null;
    Wunpus wunpus = null;
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
        char saida[] = new char[20];
        int k = 0;
        for(int i = 0; i<4; i++){
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
        return  new String(saida);
    }

    public Salas VerSala(int x, int y){
        return this.salas[y][x];
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

    public boolean ExisteWunpus(int x, int y){
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

    public int lutarComHeroi(int x, int y, boolean armado){
        int resultado = this.salas[x][y].wunpus.lutarComHeroi(armado);
        if(resultado==0){
            this.salas[y][x].Remover(salas[y][x].wunpus);
        }
        return resultado;
    }

    public void Inserir(int x, int y, Wunpus wunpus){
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
        this.salas[y][x].Remover(salas[y][x].heroi);
    }
    public void Remover(int x, int y, Ouro ouro){
        this.salas[y][x].Remover(salas[y][x].ouro);
    }
    public void Remover(int x, int y, Wunpus wunpus){
        this.salas[y][x].Remover(salas[y][x].wunpus);
    }

}
