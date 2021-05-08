package mc322.lab06;

public class Salas {
    Wunpus wunpus;
    Heroi heroi;
    Brisa brisa;
    Fedor fedor;
    Buraco buraco;
    //Ouro ouro;
    char representacao;
    public Salas(Wunpus wunpus, Heroi heroi, Brisa brisa, Buraco buraco){ // adicionar odor e ouro
        this.wunpus = wunpus;
        this.heroi = heroi;
        this.brisa = brisa;
        this.buraco = buraco;
        if(buraco!=null || wunpus!=null){
            if(heroi!=null){
                representacao = 'P';
            }
            else if( fedor != null){
                representacao = 'f';
            }
            else{
                representacao = 'b';
            }
        }
    }
}
