package mc322.lab06;

import java.util.Scanner;

public class Montador {

    String commands[][];
    CSVHandling csv;
    String caminho;
    int countBuraco = 0;
    Caverna caverna = null;

    Montador(){
        Scanner Keyboard = new Scanner(System.in);
        caminho = Keyboard.nextLine();
        csv = new CSVHandling();
        csv.setDataSource(caminho);
        commands = csv.requestCommands();
    }

    private int StringParaNumero(char numero){
        return numero - 49;
    }

    private int[] ValidaEntradaCSV(){
        int countOuro = 0;
        int countMonstro = 0;
        int countHeroi = 0;
        boolean ehValido = true;
        int posicoes[] = new int[10];
        Caverna caverna = null;
        countBuraco = 0;

        if(commands[0][1].equals("P")) {
            for (int i = 0; i < 16; i++) {
                if(commands[i][1].equals("P")){
                    countHeroi++;
                }
                else if(commands[i][1].equals("O")){
                    countOuro++;
                    posicoes[0] = StringParaNumero(commands[i][0].charAt(0));
                    posicoes[1] = StringParaNumero(commands[i][0].charAt(2));
                }
                else if(commands[i][1].equals("W")){
                    countMonstro++;
                    posicoes[2] = StringParaNumero(commands[i][0].charAt(0));
                    posicoes[3] = StringParaNumero(commands[i][0].charAt(2));
                }
                else if(commands[i][1].equals("B")){
                    countBuraco++;
                    if(countBuraco==1){
                        posicoes[4] = StringParaNumero(commands[i][0].charAt(0));
                        posicoes[5] = StringParaNumero(commands[i][0].charAt(2));
                    } else if (countBuraco==2){
                        posicoes[6] = StringParaNumero(commands[i][0].charAt(0));
                        posicoes[7] = StringParaNumero(commands[i][0].charAt(2));
                    } else if (countBuraco==3){
                        posicoes[8] = StringParaNumero(commands[i][0].charAt(0));
                        posicoes[9] = StringParaNumero(commands[i][0].charAt(2));
                    }

                }
                if (countMonstro > 1 || countHeroi > 1 || countOuro > 1 || countBuraco > 3) { //valida se estoura o numero maximo
                    ehValido = false;
                }
            }
        } else {
            ehValido = false;
        }

        if(ehValido && (countMonstro != 1 || countHeroi != 1 || countOuro != 1 || countBuraco < 2 || countBuraco > 3)) { //confere numero minimo
            ehValido = false;
        } else {
            ehValido = true;
        }
        if(ehValido){
            return posicoes;
        } else {
            posicoes[0] = -1;
            return posicoes;
        }
    }

    public Heroi MontarJogo(){
        int posicoes[] =  ValidaEntradaCSV();
        if(posicoes[0]!=-1){
            caverna = new Caverna();
            Heroi heroi = new Heroi(caverna);
            Ouro ouro = new Ouro(posicoes[0], posicoes[1],caverna);
            Wunpus wunpus = new Wunpus(posicoes[2], posicoes[3],caverna);
            Buraco buraco1 = null;
            Buraco buraco2 = null;
            Buraco buraco3 = null;
            if(countBuraco<3){
                buraco1 = new Buraco(posicoes[4], posicoes[5],caverna);
                buraco2 = new Buraco(posicoes[6], posicoes[7],caverna);
            }
            if(countBuraco == 3){
                buraco3 = new Buraco(posicoes[8], posicoes[9],caverna);
            }
            return heroi; //para mandar esse ponteiro para controlador
        } else {
            return null;
        }
    }

}
