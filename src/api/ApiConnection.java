package api;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

public class ApiConnection {
    private String apiKey = "YOUR-API-KEY";
    private String url = "https://v6.exchangerate-api.com/v6/" + apiKey;

    public JsonElement connect(String currency, String currency2, String amount) {
        try {
            // Create a client
            HttpClient client = HttpClient.newHttpClient();
            // Create a request
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url + "/pair/" + currency + "/" + currency2 + "/" + amount))
                    .build();
            // Send the request
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();
            JsonElement json = gson.fromJson(response.body(), JsonElement.class);
            return json;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return null;
    }
}
