package ERE.SistemasOperacionais;

import java.util.ArrayList;
/**
 * Autores: Arthur Terozendi e Uciolli Lemos
 */
public class SSTF {
    private ArrayList<Integer> entradas;

    public SSTF(ArrayList<Integer> entradas) {
        this.entradas = entradas;
    }

    public int escalonamento() {
        int percorrido = 0;
        int i = 0;
        int atual = 0;
        int menor = 0;
        int index = 0;
        while (true) {
            if (i == 0) {
                atual = entradas.get(0);
            }
            else{
                int menorDif = 99999;
                if (entradas.size() == 2) {
                    for (int j = 0; j < 2; j++) {
                        int dif = Math.abs(Math.abs(entradas.get(j)) - Math.abs(atual));
                        if (dif < menorDif) {
                            if (atual != entradas.get(j)) {
                                menor = entradas.get(j);
                                menorDif = dif;
                            }
                        }
                    }
                    percorrido += menorDif;
                    entradas.remove(index);

                    for (int j = 0; j < entradas.size(); j++) {
                        if (menor == entradas.get(j)) {
                            index = j;
                            break;
                        }
                    }
                    atual = menor;
                    percorrido += Math.abs(Math.abs(entradas.get(0)) - Math.abs(atual));
                    break;
                }
                for (int j = 0; j < entradas.size() ; j++) {
                    int dif = Math.abs(Math.abs(entradas.get(j)) - Math.abs(atual));
                    if (dif < menorDif) {
                        if (atual != entradas.get(j)) {
                            menor = entradas.get(j);
                            menorDif = dif;
                        }
                    }
                }

                percorrido += menorDif;
                entradas.remove(index);

                for (int j = 0; j < entradas.size(); j++) {
                    if (menor == entradas.get(j)) {
                        index = j;
                        break;
                    }
                }
                atual = menor;

            }
            i++;
        }

        return percorrido;
    }
}
