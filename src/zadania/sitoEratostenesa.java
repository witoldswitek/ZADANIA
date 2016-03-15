package zadania;

import java.util.ArrayList;
import java.util.Scanner;


public class SitoEratostenesa {

    public void getRange() {
        System.out.print("Ten program wyswietla wszystkie liczby pierwsze w podanym przedziale\nPodaj koniec przedzialu :");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("Podales zakres od 2 do " + r + ".\nOto liczby pierwsze:\n");
        ArrayList<Integer> l = createList(r);
        countFilter(l);
    }

    private void countFilter(ArrayList l) {
        int endRange = l.size()+1;
        ArrayList<Integer> tempList;
        tempList = l;

        for (int i = 2; i < l.size() + 2; i++) {

            for (int j = 0; j < l.size(); j++) {

                if (tempList.get(j) % i == 0 && tempList.get(j) > i) {

                    tempList.remove(j);
                }
            }
        }

        // displaying updated list here:

        //System.out.print("<table style=\"width:100%\"><tr>");
        System.out.print("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body><center><b>Oto liczby pierwsze z przedzialu [0 - "+endRange+"]:</center></b><table border=\"1\" style=\"width:100%\">");

        for (int j = 0; j < tempList.size(); j++) {

            if (j%10==0 && tempList.get(j)>2){ // creates 'break line' after every 50 numbers
                System.out.print("</tr><tr>");
            }

            System.out.print("<td>"+tempList.get(j)+"</td>");


        }
        System.out.print("</tr></table> \n" +
                "</body>\n" +
                "</html>");
    }

    public ArrayList createList(int r) {
        ArrayList<Integer> list = new ArrayList();

        for (int i = 2; i < (r + 1); i++) {
            list.add(i);
        }


        return list;
    }
}
