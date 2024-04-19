package main;

import java.io.IOException;

import com.google.gson.JsonElement;

import classes.Catalog;
import classes.Exchange;
import classes.Reader;
import api.ApiConnection;
import api.JsonTranslator;

public class Main {
    public static void main(String[] args) throws IOException {
        JsonTranslator translator = new JsonTranslator();
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
        JsonElement json = api.connect(currency, currency2, amount);
        Exchange exchange = translator.translateJson(json);
        exchange.showExchange();
    }
}