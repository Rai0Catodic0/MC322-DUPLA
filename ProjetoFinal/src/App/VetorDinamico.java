package App;

public class VetorDinamico {
    public Object vetor[];
    int len;
    public VetorDinamico(int len) {
        this.len = len;
        this.vetor = new Object[len];
    }

    public  void  add(Object o, int posicao){
        if (posicao>= len){
            Object [] aux = this.vetor;
            this.len++;
            this.vetor = new Object[len];
            for(int i = 0 ; i < len-1; i++) {
                vetor[i] = aux[i];
            }

        }

        this.vetor[posicao] = o;

    }
}
