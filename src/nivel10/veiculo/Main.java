package nivel10.veiculo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo("Corsa", 2009, "Cinza");
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        try (FileWriter texto = new FileWriter("texto.json")) {
            texto.write(gson.toJson(veiculo));
            System.out.println("Arquivo escrito");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
