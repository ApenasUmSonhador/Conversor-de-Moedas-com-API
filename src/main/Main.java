package main;

import java.util.Scanner;
import classes.Catalog;
import api.ApiConnection;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Necessita ver o catálogo de código de moedas disponíveis?");
        String answer = scanner.nextLine();
        if (answer.startsWith("s") || answer.startsWith("y")) {
            Catalog catalog = new Catalog();
            catalog.showCatalog();
        }
        ApiConnection api = new ApiConnection();
        api.connect("USD", "BRL", "5");
    }
}