package ERE.SistemasOperacionais;

import java.util.ArrayList;
/**
 * Autores: Arthur Terozendi e Uciolli Lemos
 */
public class FCFS {
    private ArrayList<Integer> entradas;
    public FCFS(ArrayList<Integer> entradas) {
        this.entradas = entradas;
    }

    public int escalonamento() {
        int percorrido = 0;
        for (int i = 0; i < entradas.size() - 1; i++) {
            percorrido += Math.abs(Math.abs(entradas.get(i)) - Math.abs(entradas.get(i + 1)));
        }

        return percorrido;
    }
}
