package mc322.lab06;

public class Caverna {
    Salas salas[][] = new Salas[4][4];
    Heroi heroi = null;
    Wunpus wunpus = null;
    Ouro ouro = null;
    Buraco buraco1 = null;
    Buraco buraco2 = null;
    Buraco buraco3 = null;

    public String apresenta(){
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                if(salas[i][j].representacao == 'p')
            }
        }
    }

    public void setHeroi(Heroi heroi){
        this.heroi = heroi;
    }

    public void setWunpus(Wunpus wupus){
        this.wunpus = wunpus;
    }

    public void setOuro(Ouro ouro){
        this.ouro = ouro;
    }

    public void setBuraco(Buraco buraco1, Buraco buraco2){
        this.buraco1 = buraco1;
        this.buraco2 = buraco2;
    }

    public void setBuraco(Buraco buraco1, Buraco buraco2, Buraco buraco3){
        this.buraco1 = buraco1;
        this.buraco1 = buraco1;
        this.buraco1 = buraco1;
    }

}
