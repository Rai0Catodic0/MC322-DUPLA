package Itens;

import Recursos.Recursos;

import java.util.ArrayList;
import java.util.List;

public interface IItem {
    public static List<Recursos> coletados = new ArrayList<Recursos>();
    int lutar();
    public  static void recolherRecurso(Recursos coletado) {
        coletados.add(coletado);
    }
    List<Integer> getPosition();
    String getType();
}
