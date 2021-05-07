package mc322.lab06;

public class Montador {
    String commands[][];
    Montador(){
        CSVHandling csv = new CSVHandling();
        csv.setDataSource("/home/jessica/MC322-DUPLA/Lab06/src/mc322/db/teste01.csv");
        String commands[][] = csv.requestCommands();
    }
}
