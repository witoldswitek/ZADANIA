package zadania;

import java.util.Scanner;


public class Menu {

    public void displayMenu(){
        boolean repeat = true;

        do {

            System.out.println("\n\n--------------------\nWybierz opcje:");
            System.out.println("1. Uklad rownan.");
            System.out.println("0. Zakoncz program.");
            System.out.println("--------------------");

            Scanner sc = new Scanner(System.in);
            int selectedCase = sc.nextInt();

            switch (selectedCase) {

                case 1:
                    UkladRownan u = new UkladRownan();
                    u.rozwiazRownanie();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
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
