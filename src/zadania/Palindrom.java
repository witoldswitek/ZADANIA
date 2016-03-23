package zadania;

import java.util.Scanner;

public class Palindrom {

    public void getRange() {
        System.out.print("Podaj koniec przedzialu (od zera do 196) :");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("Podales zakres od 0 do " + r);
        if (r < 197) {
            countPalindrom(r, 0);
        } else {
            System.out.println("Podales liczbe wieksza od 196!\nPodaj mniejsza liczbe!");
        }
    }

    private void countPalindrom(long r, long j) {

        for (long i = j; i < r; i++) {
            long reversedI = reverseNumber(i);

            if (i == reversedI) {
                System.out.println("Liczba " + i + " to panindrom.\n");
            } else {
                long newI = i + reversedI;
                System.out.println("Liczba " + i + " nie jest palindromem. Sprawdzam dla " + newI);
                countPalindrom(newI + 1, newI);
            }
        }
    }

    private long reverseNumber(long number) {

        long reversedNumber = 0;

        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number = number / 10;
        }
        return reversedNumber;
    }
}
