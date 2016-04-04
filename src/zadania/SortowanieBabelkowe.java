package zadania;


import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

public class SortowanieBabelkowe implements Zadanie {

    public void startTask() throws FileNotFoundException, UnsupportedEncodingException {
        System.out.println("Ten program sortuje metoda babelkowa.");
        filterBubble();
    }

    private void filterBubble() {

        ArrayList al = createTable();

        //table before changes
        System.out.print("\nPodales nastepujace liczby:\n");
        printTable(al);

        //counting
        for (int k = 0; k < al.size(); k++) {

            for (int i = 0; i < al.size() - 1; i++) {

                int first = (int) al.get(i);
                int second = (int) al.get(i + 1);

                if (first > second) {
                    int temp;
                    temp = first;
                    first = second;
                    second = temp;

                    al.set(i, first);
                    al.set(i + 1, second);
                }
            }
        }

        // table after changes
        System.out.println("\n\nPosortowana tablica:");
        printTable(al);
        al.clear();
    }

    private void printTable(ArrayList al) {
        for (int i = 0; i < al.size(); i++) {
            System.out.print("["+al.get(i) + "]");
        }
    }

    private ArrayList createTable() {

        ArrayList al = new ArrayList<Integer>();
        al.clear();
        Integer digitToSort;

        int quantity;
        System.out.println("Ile cyfr podajesz?");
        Scanner sc = new Scanner(System.in);
        quantity = sc.nextInt();

        for (int i = 0; i < quantity; i++) {
            System.out.print("Podaj kolejna cyfre zatwierdzajac enterem: ");
            Scanner s = new Scanner(System.in);
            digitToSort = s.nextInt();
            al.add(digitToSort);
        }
        return al;
    }
}
