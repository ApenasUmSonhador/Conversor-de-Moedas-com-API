package utils;
/*
 * Reader class to read the user input
 * @method readString: Read a string from the user
 * @method yesNo: Read a string from the user and return true if it starts with 'S' or 'Y'
 * @return The user input
 * @return True if the user input starts with 'S' or 'Y'
 * @return False otherwise
 * @param scanner: The scanner object
 * @param input: The user input
 */

import java.util.Scanner;

public class Reader {
    // Create a scanner object
    Scanner scanner = new Scanner(System.in);

    // Read a string from the user
    public String readString() {
        return scanner.nextLine().strip().toUpperCase();
    }

    // Read a string from the user and return true if it starts with 'S' or 'Y'
    public Boolean yesNo() {
        var input = readString();
        return input.startsWith("S") || input.startsWith("Y");
    }
}
