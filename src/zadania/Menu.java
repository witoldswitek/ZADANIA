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
            System.out.println("[1] Uklad rownan");
            System.out.println("[2] Liczba Armstronga");
            System.out.println("[3] Palindrom");
            System.out.println("[4] Sito Eratostenesa");
            System.out.println("[5] Szyfrowanie");
            System.out.println("[0] Zakoncz program! ");
            System.out.println("--------------------");

            Scanner sc = new Scanner(System.in);
            int selectedCase = sc.nextInt();

            switch (selectedCase) {

                case 1:
                    Zadanie u = new UkladRownan();
                    u.startTask();
                    break;
                case 2:
                    Zadanie l = new LiczbaArmstronga();
                    l.startTask();

                    break;
                case 3:
                    Zadanie p = new Palindrom();
                    p.startTask();
                    break;
                case 4:
                    Zadanie se = new SitoEratostenesa();
                    se.startTask();
                    break;
                case 5:
                    Zadanie sz = new Szyfrowanie();
                    sz.startTask();
                    break;
                case 0:
                    repeat = false;
                    break;
                default:
                    System.out.print("--------------------\nWybrales zla opcje!\n--------------------");
                    break;
            }
        }
        while (repeat);
    }
}
