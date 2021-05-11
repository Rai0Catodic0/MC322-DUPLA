package mc322.lab06;

public class AppMundoWumpus {
    public static void main(String args[]){
        System.out.println("hello world");
        Montador versao1 = new Montador();
        Heroi heroi = versao1.MontarJogo();
        Controle controle = new Controle(heroi);
        System.out.print(heroi.caverna.apresenta());
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.println(heroi.caverna.salas[i][j].heroi);
            }
        }
    }
}
