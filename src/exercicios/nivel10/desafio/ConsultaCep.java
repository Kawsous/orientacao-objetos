package nivel10.desafio;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCep {

    public Endereco buscaEndereco(String cep) {

        URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json/");

        HttpClient client = HttpClient.newHttpClient(); // o carteiro

        HttpRequest request = HttpRequest.newBuilder() // a carta com o endereço
                .uri(endereco).build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = (response.body());
            return new Gson().fromJson(json, Endereco.class);
        } catch (Exception e) {
            throw new RuntimeException("Endereço CEP não encontrado, tente novamente.");
        }
    }
}
