package mc322.lab06;

public class AppMundoWumpus {
    public static void main(String args[]){
        System.out.println("hello world");
        Montador versao1 = new Montador();
        Heroi heroi = versao1.MontarJogo();
        Controle controle = new Controle(heroi);
        System.out.print(heroi.caverna.apresenta());

        System.out.println("heroi "+heroi.caverna.salas[0][0].heroi);
        System.out.println("heroi "+heroi.caverna.salas[0][0].representacao);
    }
}
