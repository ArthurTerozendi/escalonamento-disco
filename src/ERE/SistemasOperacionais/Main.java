package ERE.SistemasOperacionais;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Autores: Arthur Terozendi e Uciolli Lemos
 */
public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Leitor leitor = new Leitor("entradas.txt");

        int totalCilindro =  leitor.getTamanhoDisco();
        ArrayList<Integer> entradas = leitor.ler();
        FCFS fcfs = new FCFS(entradas);
        entradas = leitor.ler();
        SSTF sstf = new SSTF(entradas);
        entradas = leitor.ler();
        SCAN scan = new SCAN(entradas, totalCilindro);

        System.out.println(fcfs.escalonamento());
        System.out.println(sstf.escalonamento());
        System.out.println(scan.escalonamento());
    }
}
