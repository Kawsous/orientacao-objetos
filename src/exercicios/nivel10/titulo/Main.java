package nivel10.titulo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Titulo titulo = new Titulo("Kawan", "Creatina");

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        gson.toJson(titulo);

        try (FileWriter texto = new FileWriter("texto.json")) {
            texto.write(gson.toJson(titulo));
            System.out.println("Arquivo salvo");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(titulo);
    }
}
