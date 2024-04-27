package main;

import java.io.IOException;
/*
 * Main class to run the program
 * @method main: The main method to run the program
 * @param args: The command line arguments
 * @param catalog: The catalog object
 * @param reader: The reader object
 * @param api: The API connection object
 * @param response: The response from the API
 * @param exchange: The exchange object
 * @param currency: The base currency
 * @param currency2: The target currency
 * @param amount: The amount to be converted
 * @param catalog: The catalog object
 * @param reader: The reader object
 * @param api: The API connection object
 */
import classes.Catalog;
import classes.Exchange;
import utils.Reader;
import api.ApiConnection;
import api.ApiResponse;

public class Main {
    public static void main(String[] args) throws IOException {
        // Create an API connection, a reader and a catalog
        ApiConnection api = new ApiConnection();
        Catalog catalog = new Catalog();
        Reader reader = new Reader();

        // Show the catalog
        catalog.showCatalog(reader);

        // Get the user input and connect to the API
        System.out.println("Digite o código da moeda de origem:");
        String currency = reader.readString();
        System.out.println("Digite o código da moeda de destino:");
        String currency2 = reader.readString();
        System.out.println("Digite o valor a ser convertido:");
        String amount = reader.readString();
        ApiResponse response = api.connect(currency, currency2, amount);

        // Create an exchange object
        Exchange exchange = new Exchange(response);

        // Show the exchange information
        exchange.showExchange();
    }
}