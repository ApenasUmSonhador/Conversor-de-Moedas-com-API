package classes;

import java.util.Scanner;

public class Reader {
    Scanner scanner = new Scanner(System.in);

    public String readString() {
        return scanner.nextLine().strip().toUpperCase();
    }

    public Boolean yesNo() {
        var input = scanner.nextLine();
        return input.startsWith("S") || input.startsWith("Y");
    }
}
