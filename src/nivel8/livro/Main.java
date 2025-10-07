package nivel8.livro;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        String json = "{\"titulo\":\"Aventuras do Java\",\"autor\":\"Akemi\"," +
                "\"editora\":{\"nome\":\"TechBooks\",\"cidade\":\"São Paulo\"}}";

        Gson gson = new Gson();
        Livro livro = gson.fromJson(json, Livro.class);

        System.out.println(livro);
    }
}
