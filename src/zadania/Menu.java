package zadania;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;


public class Menu {

    public void displayMenu() throws FileNotFoundException, UnsupportedEncodingException {
        boolean repeat = true;

        do {

            System.out.println("\n\n--------------------");
            System.out.println(" Wybierz opcje:");
            System.out.println("--------------------");
            System.out.println("1. Uklad rownan.");
            System.out.println("2. Liczba Armstronga");
            System.out.println("3. Palindrom");
            System.out.println("4. Sito Eratostenesa");
            System.out.println("5. Szyfrowanie");
            System.out.println("0. Zakoncz program. ");
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
                    Szyfrowanie sz = new Szyfrowanie();
                    sz.cypherData();
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
