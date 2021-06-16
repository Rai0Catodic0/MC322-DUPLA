package App;

public class coisa {
    public static void main(String args[]){
        Integer x = new Integer(4);
        VetorDinamico v = new VetorDinamico(3);
        v.add(0,0);
        v.add("abelha",1);
        v.add(11.0,2);
        v.add(3,3);
        for(int i = 0 ; i < 4; i++){
            System.out.println(v.vetor[i]);
        }
    }
}
