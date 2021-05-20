package mc322.lab06;

public class AppMundoWumpus {
    public static void main(String args[]){
        Montador versao1 = new Montador();
        Heroi heroi = versao1.MontarJogo();
        Controle controle = new Controle(heroi);
        controle.IniciarJogo();
    }
}
