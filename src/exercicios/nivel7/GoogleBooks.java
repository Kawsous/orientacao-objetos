package nivel7;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GoogleBooks {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);

        HttpClient client = HttpClient.newHttpClient(); // o carteiro
        String endereco = "https://www.googleapis.com/books/v1/volumes?q=";
        String chave = "&key=AIzaSyAebduy1M8bCxtNztcrlmeGYecckcMSAkU";

        System.out.println("Digite o nome do livro: ");
        String livro = sc.nextLine();


        HttpRequest request = HttpRequest.newBuilder() // a carta com o endereço
                .uri(URI.create(endereco + livro + chave))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
