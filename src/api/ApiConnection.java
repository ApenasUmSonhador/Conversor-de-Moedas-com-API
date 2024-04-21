package api;
/*
 * ApiConnection class to connect to the API
 * @param apiKey: The API key
 * @param url: The API URL
 * @method connect: Connect to the API and return the response
 * @return The response from the API
 * @param currency: The base currency
 * @param currency2: The target currency
 * @param amount: The amount to be converted
 * @param client: The HTTP client
 * @param request: The HTTP request
 * @param response: The HTTP response
 * @param gson: The GSON object
 * @param r: The response object
 * @param e: The exception
 * @return Null if an exception occurs
 * @return The response object otherwise
 */

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;

public class ApiConnection {
    // API key
    private String apiKey = "YOUR-API-KEY";
    private String url = "https://v6.exchangerate-api.com/v6/" + apiKey;

    public ApiResponse connect(String currency, String currency2, String amount) {
        try {
            // Create a client
            HttpClient client = HttpClient.newHttpClient();
            // Create a request
            HttpRequest request = HttpRequest.newBuilder()
                    // Set the URL like(10 USD => n EUR):
                    // https://v6.exchangerate-api.com/v6/YOUR-API-KEY/pair/USD/EUR/10
                    .uri(URI.create(url + "/pair/" + currency + "/" + currency2 + "/" + amount))
                    .build();
            // Send the request
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            // Parse the response
            Gson gson = new Gson().newBuilder().setPrettyPrinting().create();
            ApiResponse r = gson.fromJson(response.body(), ApiResponse.class);
            // Return the response
            return r;
        }
        // Catch any exceptions
        catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }
    }
}
