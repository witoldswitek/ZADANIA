package zadania;


import zadania.Menu;


public class Zadania {

    public static void main(String[] args) {
        Menu mainMenu; // tu deklarujesz referencje na obiekt
        mainMenu = new Menu(); // tu tworzysz (inicjalizujesz) nowy obiekt klasy Menu o referencji mainMenu
        mainMenu.displayMenu();
    }
}
