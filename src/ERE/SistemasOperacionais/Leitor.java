package ERE.SistemasOperacionais;

import java.io.*;
import java.util.ArrayList;

/**
 * Autores: Arthur Terozendi e Uciolli Lemos
 */
public class Leitor {
    private File file;

    public Leitor(String path) {
        this.file = new File(path);
    }

    public ArrayList<Integer> ler() throws IOException {
        ArrayList<Integer> entrada = new ArrayList<>();
        FileReader leitor = new FileReader(file);
        BufferedReader bLeitor =  new BufferedReader(leitor);
        int i = 0;
        while(bLeitor.ready()) {
            if (i != 0) {
                entrada.add(Integer.parseInt(bLeitor.readLine()));
            }
            else {
                bLeitor.readLine();
            }
            i++;
        }

        bLeitor.close();
        leitor.close();
        return entrada;
    }
    public int getTamanhoDisco() throws IOException {
        FileReader leitor = new FileReader(file);
        BufferedReader bLeitor =  new BufferedReader(leitor);
        int tamanhoDisco = Integer.parseInt(bLeitor.readLine());

        return tamanhoDisco;
    }

}
