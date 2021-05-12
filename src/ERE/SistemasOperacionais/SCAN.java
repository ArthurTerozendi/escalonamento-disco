package ERE.SistemasOperacionais;

import java.util.ArrayList;
import java.util.Collections;
/**
 * Autores: Arthur Terozendi e Uciolli Lemos
 */
public class SCAN {
    private ArrayList<Integer> entradas;
    private int totalCilindro;

    public SCAN(ArrayList<Integer> entradas, int totalCilindro) {
        this.entradas = entradas;
        this.totalCilindro = totalCilindro;
    }

    public int escalonamento() {
        int percorrido = 0;
        int inicio = entradas.get(0);

        Collections.sort(entradas);

        int menor = entradas.get(0);
        int maior = entradas.get(entradas.size() - 1);
        percorrido = Math.abs(Math.abs(inicio) - Math.abs(maior)) + Math.abs(Math.abs(maior) - Math.abs(menor));

        return percorrido;
    }
}
