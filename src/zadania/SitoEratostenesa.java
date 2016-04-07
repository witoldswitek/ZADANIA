package zadania;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;


public class SitoEratostenesa implements Zadanie{

    public void startTask() throws FileNotFoundException, UnsupportedEncodingException {
        System.out.print("Ten program wyswietla wszystkie liczby pierwsze w podanym przedziale\n\nPodaj koniec przedzialu :");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("Podales zakres od 2 do " + r);
        ArrayList<Integer> l = createList(r);
        countFilter(l);
    }

    private void countFilter(ArrayList l) throws FileNotFoundException, UnsupportedEncodingException {
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


        PrintWriter writer = new PrintWriter("table.html", "UTF-8");




        writer.println("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body><center><b>Oto liczby pierwsze z przedzialu [0 - "+endRange+"]:</b></center><table border=\"1\" style=\"width:100%\"><tr>");

        for (int j = 0; j < tempList.size(); j++) {

            if (j%10==0 && tempList.get(j)>2){ // creates 'break line' after every 50 numbers
                writer.println("</tr><tr>");
            }

            writer.println("<td>"+tempList.get(j)+"</td>");


        }
        writer.println("</tr></table> \n" +
                "</body>\n" +
                "</html>");
        writer.close();
    }

    public ArrayList createList(int r) {
        ArrayList<Integer> list = new ArrayList();

        for (int i = 2; i < (r + 1); i++) {
            list.add(i);
        }


        return list;
    }
}
