package mc322.lab06;

public class Salas {
    Wunpus wunpus;
    Heroi heroi;
    Brisa brisa;
    Fedor fedor;
    Buraco buraco;
    Ouro ouro;
    int x, y;
    boolean visitada;
    char representacao;

    public Salas(Wunpus wunpus, Heroi heroi, Brisa brisa, Buraco buraco, int x, int y){ // adicionar odor e ouro
        this.wunpus = wunpus;
        this.heroi = heroi;
        this.brisa = brisa;
        this.buraco = buraco;
        this.representacao = '-';
        visitada = false;
        this.x = x;
        this.y = y;
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
                } else if(this.brisa!=null){
                    representacao = 'b';
                } else {
                    representacao = '#';
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
//    public  void  Remover(Wunpus wunpus){
//        if(this.wunpus.f1!=null){
//            int x = this.wunpus.f1.x;
//            int y =this.wunpus.f1.y;
//            //System.out.println("f1 diferente de null"+x+" "+y);
//            this.wunpus.caverna.salas[x][y].Remover(this.wunpus.f1);
//        }
//        if(this.wunpus.f2!=null){
//            int x = this.wunpus.f2.x;
//            int y =this.wunpus.f2.y;
//            //System.out.println("f2 diferente de null"+x+" "+y);
//            this.wunpus.caverna.salas[x][y].Remover(this.wunpus.f2);
//        }
//        if(this.wunpus.f3!=null){
//            int x = this.wunpus.f3.x;
//            int y =this.wunpus.f3.y;
//            //System.out.println("f3 diferente de null"+x+" "+y);
//            this.wunpus.caverna.salas[x][y].Remover(this.wunpus.f3);
//        }
//        if(this.wunpus.f4!=null){
//            int x = this.wunpus.f4.x;
//            int y =this.wunpus.f4.y;
//            //System.out.println("f4 diferente de null"+x+" "+y);
//            this.wunpus.caverna.salas[x][y].Remover(this.wunpus.f4);
//        }
//        this.wunpus = null;
//        setEstado();
//    }

    public  void  Remover(Wunpus wunpus){
        this.wunpus = null;
        setEstado();
    }

    public  void  Remover(Fedor fedor){
        this.fedor = null;
        setEstado();
    }
}
