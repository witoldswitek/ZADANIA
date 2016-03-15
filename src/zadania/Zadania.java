package zadania;


import zadania.Menu;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;


public class Zadania {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Menu mainMenu; // tu deklarujesz referencje na obiekt
        mainMenu = new Menu(); // tu tworzysz (inicjalizujesz) nowy obiekt klasy Menu o referencji mainMenu
        mainMenu.displayMenu(); // test
    }
}
