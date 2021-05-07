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
                switch (commands[i][1]) {
                    case "P":
                        countHeroi++;
                        break;
                    case "O":
                        countOuro++;
                        break;
                    case "W":
                        countMonstro++;
                        break;
                    case "k":
                        countBuraco++;
                        break;
                }
                if (countMonstro != 1 || countHeroi != 1 || countOuro != 1 || (countBuraco < 2 && countBuraco > 3)) {
                    System.out.println("Construção de jogo inválida");
                    break;
                }
            }
        } else {
            System.out.println("Herói não inicia na sala correta!"+commands[0][1]);
        }
    }

}

///home/jessica/MC322-DUPLA/Lab06/src/mc322/db/teste01.csv
