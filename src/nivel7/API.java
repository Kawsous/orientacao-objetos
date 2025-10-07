package nivel7;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class API {
    public class ExemploHttp {
        public static void main(String[] args) throws Exception {

            // 1. Cria o cliente HTTP
            HttpClient client = HttpClient.newHttpClient();

            // 2. Monta a requisição (GET)
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://api.github.com")).build();

            // 3. Envia e recebe a resposta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // 4. Exibe as informações da resposta
            System.out.println("Status: " + response.statusCode());
            System.out.println("Cabeçalhos: " + response.headers());
            System.out.println("Corpo: " + response.body());
        }
    }
}
