package com.moonsolution.conversormonedas.Services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.moonsolution.conversormonedas.Models.DatosConversion;
import io.github.cdimascio.dotenv.Dotenv;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaApi {
    private final String apiKey;
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public ConsultaApi() {
        Dotenv dotenv = Dotenv.load(); // Carga las variables del .env
        this.apiKey = dotenv.get("EXCHANGE_API_KEY");
    }

    public DatosConversion obtenerConversion(String base, String destino) {
        String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + base + "/" + destino;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return gson.fromJson(response.body(), DatosConversion.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("No se pudo conectar a la API", e);
        }
    }
}
