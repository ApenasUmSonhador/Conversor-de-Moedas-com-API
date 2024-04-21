package main;

import java.io.IOException;

import classes.Catalog;
import classes.Exchange;
import classes.Reader;
import api.ApiConnection;
import api.ApiResponse;

public class Main {
    public static void main(String[] args) throws IOException {
        Catalog catalog = new Catalog();
        Reader reader = new Reader();
        catalog.showCatalog(reader);
        ApiConnection api = new ApiConnection();
        System.out.println("Digite o código da moeda de origem:");
        String currency = reader.readString();
        System.out.println("Digite o código da moeda de destino:");
        String currency2 = reader.readString();
        System.out.println("Digite o valor a ser convertido:");
        String amount = reader.readString();
        ApiResponse response = api.connect(currency, currency2, amount);
        Exchange exchange = new Exchange(response);
        exchange.showExchange();
    }
}