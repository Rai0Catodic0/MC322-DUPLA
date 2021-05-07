package mc322.lab06;

import java.util.Scanner;

public class Montador {

    String commands[][];
    CSVHandling csv;
    String caminho;

    Montador(){
        Scanner Keyboard = new Scanner(System.in);
        caminho = Keyboard.nextLine();
        csv = new CSVHandling();
        csv.setDataSource(caminho);
        commands = csv.requestCommands();
    }

    public void IniciaJogo(){
        int countOuro = 0;
        int countMonstro = 0;
        int countBuraco = 0;
        int countHeroi = 0;
        System.out.println(commands[0][1]+"aaaaaaaa");
        if(commands[0][1].equals("P")) {
            for (int i = 0; i < 16; i++) {
                    if(commands[i][1].equals("P")){
                        countHeroi++;
                    }
                    else if(commands[i][1].equals("O")){
                        System.out.println("hehehehehh");
                        countOuro++;
                    }
                    else if(commands[i][1].equals("W")){
                        countMonstro++;
                    }
                    else if(commands[i][1].equals("B")){
                        countBuraco++;
                    }
                if (countMonstro > 1 || countHeroi > 1 || countOuro > 1 || countBuraco > 3) {
                    System.out.println("Construção de jogo inválida");
                    System.out.println(countHeroi);
                    System.out.println(countMonstro);
                    System.out.println(countOuro);
                    System.out.println(countBuraco);
                    break;
                }
            }
        } else {
            System.out.println("Herói não inicia na sala correta!"+commands[0][1]);
        }
    }

}

///home/jessica/MC322-DUPLA/Lab06/src/mc322/db/teste01.csv
