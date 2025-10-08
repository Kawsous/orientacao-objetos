package nivel7;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class TheMealDB {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do prato: ");
        String prato = sc.nextLine();
        String endereco = "https://www.themealdb.com/api/json/v1/1/search.php?s=";

        HttpClient client = HttpClient.newHttpClient(); // o carteiro

        HttpRequest request = HttpRequest.newBuilder() // a carta com o endereço
                .uri(URI.create(endereco + prato))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
