package zadania;

import java.util.Scanner;


public class Menu {

    public void displayMenu() {
        boolean repeat = true;

        do {

            System.out.println("\n\n--------------------\nWybierz opcje:");
            System.out.println("1. Uklad rownan.");
            System.out.println("2. Liczba Armstronga");
            System.out.println("3. Palindrom");
            System.out.println("4. Sito Eratostenesa");
            System.out.println("0. Zakoncz program.");
            System.out.println("--------------------");

            Scanner sc = new Scanner(System.in);
            int selectedCase = sc.nextInt();

            switch (selectedCase) {

                case 1:
                    UkladRownan u = new UkladRownan();
                    u.solve();
                    break;
                case 2:
                    LiczbaArmstronga l = new LiczbaArmstronga();
                    l.displayMessage();

                    break;
                case 3:
                    Palindrom p = new Palindrom();
                    p.getRange();
                    break;
                case 4:
                    SitoEratostenesa se = new SitoEratostenesa();
                    se.getRange();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 0:
                    repeat = false;
                    break;
                default:
                    break;
            }
        }
        while (repeat);
    }
}
