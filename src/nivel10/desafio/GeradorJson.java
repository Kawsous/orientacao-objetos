package nivel10.desafio;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorJson {

    public void salvaJson(Endereco endereco) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try {
            FileWriter texto = new FileWriter(endereco.cep() + ".json");
            texto.write(gson.toJson(endereco));
            texto.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando aplicação");
        }
    }
}
