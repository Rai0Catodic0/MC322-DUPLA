package mc322.lab06;

public class Salas {
    Wunpus wunpus;
    Heroi heroi;
    Brisa brisa;
    Fedor fedor;
    Buraco buraco;
    Ouro ouro;
    boolean visitada;

    char representacao;
    public Salas(Wunpus wunpus, Heroi heroi, Brisa brisa, Buraco buraco){ // adicionar odor e ouro
        this.wunpus = wunpus;
        this.heroi = heroi;
        this.brisa = brisa;
        this.buraco = buraco;
        this.representacao = '-';
        visitada = false;
    }

    private void setEstado(){
        if(this.wunpus!=null){
            representacao = 'W';
        } else if(this.ouro!=null){
            representacao = 'O';
        } else if(this.buraco != null){
            representacao='B';
        } else {
            if (this.heroi != null) {
                representacao = 'P';
            }
            else {
                if (this.fedor != null) {
                    representacao = 'f';
                } else{
                    representacao = 'b';
                }
            }
        }
    }

    public boolean Inserir(Buraco buraco){
        if(this.wunpus == null && this.ouro == null){
            this.buraco = buraco;
            setEstado();
            return true;
        }
        return false;
    }

    public boolean Inserir(Heroi heroi){
       this.heroi = heroi;
       setEstado();
       this.visitada = true;
       return true;
    }

    public boolean Inserir(Wunpus wunpus){
        if(this.buraco == null && this.ouro == null){
            this.wunpus = wunpus;
            setEstado();
            return true;
        }
        return false;
    }

    public boolean Inserir(Ouro ouro){
        if(this.buraco == null && this.wunpus == null){
            this.ouro = ouro;
            setEstado();
            return true;
        }
        return false;
    }

    public boolean Inserir(Brisa brisa){
        this.brisa  = brisa;
        setEstado();
        return true;
    }

    public boolean Inserir(Fedor fedor){
        this.fedor = fedor;
        setEstado();
        return true;
    }
    public void Remover(Heroi heroi){
        this.heroi = null;
        setEstado();
    }
    public void Remover(Ouro ouro){
        this.ouro = null;
        setEstado();
    }
}
