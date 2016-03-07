package zadania;

/**
 * Created by ICom on 2016-03-07.
 */

import zadania.Menu;




public class Zadania {

    public static void main(String[] args)
    {
        System.out.println("TEST");

        Menu mainMenu; // tu deklarujesz referencje na obiekt
        mainMenu = new Menu(); // tu tworzysz (inicjalizujesz) nowy obiekt klasy Menu o referencji mainMenu
        mainMenu.displayMenu();
    }
}
