package br.com.alura.screenmatch.services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoApi {

    public String obterDados(String end) {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(end))
                .build();

        try {
            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (IOException | InterruptedException | IllegalArgumentException e) {
            throw new RuntimeException(e);
        }

    }

}
