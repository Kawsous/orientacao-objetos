package nivel9.github;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Pesquise algum usuário do github");
            String username = sc.nextLine();
            String endereco = "https://api.github.com/users/";

            HttpClient client = HttpClient.newHttpClient(); // o carteiro

            HttpRequest request = HttpRequest.newBuilder() // a carta com o endereço
                    .uri(URI.create(endereco + username))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404) {
                throw new ErroConsultaGithub("Usuario nao encontrado");
            }

            System.out.println(response.body());

        } catch (ErroConsultaGithub e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}