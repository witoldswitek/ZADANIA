package zadania;


import java.util.ArrayList;
import java.util.Scanner;


public class Szyfrowanie implements Zadanie{

    private String readWord() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Podaj slowo do zaszyfrowania: ");
        String word = sc1.nextLine();
        return word.toLowerCase();
    }

    private int readNumber() {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Podaj liczbe do zaszyfrowania: ");

        return sc2.nextInt();
    }

    public void startTask() {

        String w = readWord();
        int n = readNumber();

        int diff = w.length() / (String.valueOf(n)).length();

        String numberConcat = "";
        for (int i = 0; i < diff + 1; i++) {
            numberConcat = numberConcat + String.valueOf(n);
        }

        System.out.println("Podales slowo [" + w + "] i liczbe [" + n + "].");

        char[] alphabet = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz".toCharArray();

        ArrayList<Character> alphabetArray = new ArrayList<>();
        for (int aL = 0; aL < alphabet.length; aL++) {
            alphabetArray.add(alphabet[aL]);
        }

        ArrayList<Character> arrayWord = new ArrayList<>();
        for (int iW = 0; iW < w.length(); iW++) {
            arrayWord.add(w.charAt(iW));
        }

        System.out.print("Oto zaszyfrowane slowo:[");

        for (int j = 0; j < arrayWord.size(); j++) {

            for (int aW = 0; aW < 26; aW++) {

                String numberConcatChar = String.valueOf(numberConcat.charAt(j));
                Integer numberConcatCharInt = Integer.parseInt(numberConcatChar);
                if (arrayWord.get(j) == alphabetArray.get((aW))) {
                    System.out.print(alphabetArray.get(aW + numberConcatCharInt));
                }
            }
        }
        System.out.println("]\n");
    }
}