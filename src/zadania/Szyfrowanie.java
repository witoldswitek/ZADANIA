package zadania;


import java.util.ArrayList;
import java.util.Scanner;


public class Szyfrowanie {

    private String readWord(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Podaj slowo do zaszyfrowania: ");
        String word =sc1.nextLine();
        return word.toLowerCase();
    }
    private int readNumber(){
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Podaj liczbe do zaszyfrowania: ");

        return sc2.nextInt();
    }

    public void cypherData(){

        // zczytujemy slowo i numer z wykonanych metod
        String w = readWord();
        int n = readNumber();

        // sprawdzamy, ile razy w slowie miesci sie podany numer, np 123 miesci sie 4 razy w slowie programowanie
        int diff= w.length()/(String.valueOf(n)).length();

        // numer zostaje zmieniony na String
        String numberConcat="";
        for(int i=0;i <diff+1;i++){
            numberConcat = numberConcat+String.valueOf(n);
        }

        System.out.println("Podales slowo ["+w+"] i liczbe ["+n+"].");

        // tworzymy tablice char z podwojnym alfabetem, bo chemy po wykroczeniu poza "Z" dalej uzywac afabetu
        char[] alphabet = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz".toCharArray();

        // alphabet zmieniamy w arraylist
        ArrayList<Character> alphabetArray = new ArrayList<>();
        for (int aL=0;aL<alphabet.length;aL++){
            alphabetArray.add(alphabet[aL]);
        }

        // slowo zostaje rozbite na arrayliste
        ArrayList<Character> arrayWord = new ArrayList<>();
        for(int iW=0;iW <w.length();iW++){
            arrayWord.add(w.charAt(iW));
        }

        System.out.print("Oto zaszyfrowane slowo:[");

        // dla kazdej litery w slowie znajdujemy jej index w alfabecie i powiekszamy o odpowiednia wartosc z numeru
        for (int j=0;j<arrayWord.size();j++){

            for (int aW=0;aW<26;aW++) {

                String numberConcatChar = String.valueOf(numberConcat.charAt(j));
                Integer numberConcatCharInt = Integer.parseInt(numberConcatChar);
                if (arrayWord.get(j) == alphabetArray.get((aW))) {
                    System.out.print(alphabetArray.get(aW+numberConcatCharInt));
                }
            }
        }
        System.out.println("]\n");
    }
}