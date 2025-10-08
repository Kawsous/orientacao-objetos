package nivel10.arquivo;

import java.io.FileWriter;
import java.io.IOException;

public class Arquivo {
    public static void main(String[] args) {
        String data = "conteudo a ser gravado no arquivo";

        try ( FileWriter texto = new FileWriter("arquivo.txt")) {
            texto.write(data);
            System.out.println("Arquivo salvo com sucesso");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
