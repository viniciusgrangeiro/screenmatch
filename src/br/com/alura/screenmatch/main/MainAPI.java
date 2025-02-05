package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.exception.YearConversionException;
import br.com.alura.screenmatch.modelos.Title;
import br.com.alura.screenmatch.modelos.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainAPI {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        String search = "";

        List<Title> titles = new ArrayList<>();

        // cria um objeto com os nomes dos campos em maiusculo
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (!search.equalsIgnoreCase("sair")) {


            System.out.println("Digite o nome do filme");
            var film = sc.nextLine();

            if (film.equalsIgnoreCase("sair")){
                break;
            }
            search = "https://www.omdbapi.com/?t=" + film.replace(" ", "+") + "&apikey=1a8e44f3";

            try {
                // Gerando um client
                HttpClient client = HttpClient.newHttpClient();

                // Gerando uma requisicao
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(search))
                        .build();

                // Recebendo a resposta
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                // Exibindo a resposta
                String json = response.body();
                System.out.println(json);

                // Utilizando uma biblioteca chamada de Gson, poderemos transormar
                // um json em um objeto
                // Gson gson = new Gson();




                // Convertendo json em TitleOmdb
                TitleOmdb myTitleOmdb = gson.fromJson(json, TitleOmdb.class);
                System.out.println(myTitleOmdb);

//        try {
                // Transformando Titulo em um TitleOmdb
                Title myTitle = new Title(myTitleOmdb);
                // Criando um titulo, com base no objeto json que foi criado
                System.out.println("Titulo convertido");
                System.out.println(myTitle);

                titles.add(myTitle);

                // Criando um arquivo txt
//                FileWriter writer = new FileWriter("films.txt");
//                // Escrevendo no arquivo txt o meu objeto TitleOmdb
//                writer.write(myTitle.toString());
//                writer.close();

            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro:");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Erro de argumentos, o endereço digitado não é valido");
                System.out.println(e.getMessage());
            } catch (YearConversionException e) {
                System.out.println(e.getMessage());
            }
        }

        FileWriter writer = new FileWriter("films.json");
        writer.write(gson.toJson(titles));
        writer.close();

        System.out.println("O programa finalizou!");

    }
}
